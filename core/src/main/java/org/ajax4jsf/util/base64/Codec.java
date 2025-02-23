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

import jakarta.faces.FacesException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

public class Codec {
    private static final String ALGORITHM = "AES/CFB/PKCS5Padding";
    private static final int AES_KEY_SIZE = 128; // in bits

    private final Cipher decripter;
    private final Cipher encripter;

    public Codec() {
        super();

        // Initialize the Ciphers
        try {
            // Create a random secret key
            SecureRandom random = SecureRandom.getInstanceStrong();
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(AES_KEY_SIZE, random);
            SecretKey secretKey = keyGen.generateKey();

            // Create the initialization vector
            byte[] iv = new byte[16];
            new SecureRandom().nextBytes(iv);
            IvParameterSpec spec = new IvParameterSpec(iv);

            // Init the encripter
            encripter = Cipher.getInstance(ALGORITHM);
            encripter.init(Cipher.ENCRYPT_MODE, secretKey, spec, random);

            // Init the decripter
            decripter = Cipher.getInstance(ALGORITHM);
            decripter.init(Cipher.DECRYPT_MODE, secretKey, spec, random);
        } catch (Exception e) {
            throw new FacesException("Error set encryption key", e);
        }
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

    public synchronized byte[] decode(byte[] src) throws Exception {
        byte[] dec = URL64Codec.decodeBase64(src);
        return decripter.doFinal(dec);
    }

    public synchronized byte[] encode(byte[] src) throws Exception {
        byte[] dec = encripter.doFinal(src);
        return URL64Codec.encodeBase64(dec);
    }
}
