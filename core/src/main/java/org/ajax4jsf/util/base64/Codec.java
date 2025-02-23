/**
 * License Agreement.
 * <p>
 * Rich Faces - Natural Ajax for Java Server Faces (JSF)
 * <p>
 * Copyright (C) 2007 Exadel, Inc.
 * <p>
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 * <p>
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */
package org.ajax4jsf.util.base64;

import com.google.common.primitives.Bytes;
import jakarta.faces.FacesException;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.logging.Logger;

public class Codec {
    private static final String KEY_ALGORITHM = "AES";
    private static final String ALGORITHM = "AES/CFB/PKCS5Padding";
    private static final int AES_KEY_SIZE = 128; // in bits
    private static final int IV_LENGTH = 16;

    private static final String ENCRYPT_PASSWORD_CONFIG = "org.ajax4jsf.ENCRYPT_PASSWORD";
    private static final String ENCRYPT_RESOURCE_DATA_CONFIG = "org.ajax4jsf.ENCRYPT_RESOURCE_DATA";

    private static final Logger log = Logger.getLogger(Codec.class.getName());

    private final boolean encryptionEnabled;
    private final SecureRandom random;
    private final SecretKey secretKey;

    public Codec() {
        super();

        // Initialize encryption
        try {
            encryptionEnabled = encryptionIsEnabled();
            if (encryptionEnabled) {
                random = SecureRandom.getInstanceStrong();
                secretKey = getSecretKey();
            } else {
                random = null;
                secretKey = null;
            }
        } catch (NoSuchAlgorithmException e) {
            throw new FacesException("Error set encryption randomizer: ", e);
        }
    }

    private SecretKey getSecretKey() {
        try {
            // Get the optionally configured password
            String password = null;
            FacesContext facesContext = FacesContext.getCurrentInstance();
            if (facesContext != null) {
                ExternalContext externalContext = facesContext.getExternalContext();
                password = externalContext.getInitParameter(ENCRYPT_PASSWORD_CONFIG);
            }

            if (password != null && !password.trim().isEmpty()) {
                log.info("Resource reference encoding: Setting fixed resource encoding password");
                MessageDigest sha = MessageDigest.getInstance("SHA-256");
                byte[] shaKey = sha.digest(password.getBytes(StandardCharsets.UTF_8));
                byte[] finalKey = Arrays.copyOf(shaKey, 16);
                return new SecretKeySpec(finalKey, KEY_ALGORITHM);
            } else {
                log.info("Resource reference encoding: Generating random password");
                KeyGenerator keyGen = KeyGenerator.getInstance(KEY_ALGORITHM);
                keyGen.init(AES_KEY_SIZE, random);
                return keyGen.generateKey();
            }
        } catch (Exception e) {
            throw new FacesException("Error set encryption key: " + e.getMessage(), e);
        }
    }

    private boolean encryptionIsEnabled() {
        final boolean enabled;

        FacesContext facesContext = FacesContext.getCurrentInstance();
        if (facesContext != null) {
            ExternalContext externalContext = facesContext.getExternalContext();
            String configFlag = externalContext.getInitParameter(ENCRYPT_RESOURCE_DATA_CONFIG);
            enabled = configFlag == null || !configFlag.equalsIgnoreCase("false");
        } else {
            enabled = true;
        }
        log.info(() -> String.format("Resource reference encoding: Encryption %s", enabled ? "enabled" : "disabled"));
        return enabled;
    }

    public String decode(String str) throws Exception {
        byte[] src = str.getBytes(StandardCharsets.UTF_8);
        byte[] utf8 = decode(src);
        return new String(utf8, StandardCharsets.UTF_8);
    }

    public String encode(String str) throws Exception {
        byte[] src = str.getBytes(StandardCharsets.UTF_8);
        byte[] utf8 = encode(src);
        return new String(utf8, StandardCharsets.UTF_8);
    }

    public byte[] decode(byte[] src) throws Exception {
        byte[] bytes = URL64Codec.decodeBase64(src);

        if (!encryptionEnabled) return bytes;

        // First IV_LENGTH bytes contain the IV
        byte[] iv = Arrays.copyOfRange(bytes, 0, IV_LENGTH);
        IvParameterSpec spec = new IvParameterSpec(iv);

        // Init the decripter
        Cipher decripter = Cipher.getInstance(ALGORITHM);
        decripter.init(Cipher.DECRYPT_MODE, secretKey, spec, random);

        byte[] encrypted = Arrays.copyOfRange(bytes, IV_LENGTH, bytes.length);
        return decripter.doFinal(encrypted);
    }

    public byte[] encode(byte[] src) throws Exception {
        if (!encryptionEnabled) return URL64Codec.encodeBase64(src);

        // Create the initialization vector
        byte[] iv = new byte[IV_LENGTH];
        random.nextBytes(iv);
        IvParameterSpec spec = new IvParameterSpec(iv);

        // Init the encripter
        Cipher encripter = Cipher.getInstance(ALGORITHM);
        encripter.init(Cipher.ENCRYPT_MODE, secretKey, spec, random);

        byte[] encrypted = encripter.doFinal(src);
        byte[] bytes = Bytes.concat(iv, encrypted);
        return URL64Codec.encodeBase64(bytes);
    }
}
