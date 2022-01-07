/**
 * License Agreement.
 *
 * Rich Faces - Natural Ajax for Java Server Faces (JSF)
 *
 * Copyright (C) 2007 Exadel, Inc.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License version 2.1 as published by the Free Software Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA
 */
package org.ajax4jsf.util.base64;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.faces.FacesException;

/**
 * @author shura (latest modification by $Author: alexsmirnov $)
 * @version $Revision: 1.1.2.1 $ $Date: 2007/01/09 18:59:10 $
 */
public class Codec {
    private Cipher decripter = null;
    private Cipher encripter = null;

    /**
     *
     */
    public Codec() {
    	super();
    }

    /**
     *
     */
    public Codec(String p) throws Exception {
    	super();
        setPassword(p);
    }

    /**
     * @param password
     * @throws java.security.InvalidKeyException
     *
     * @throws java.io.UnsupportedEncodingException
     *
     * @throws java.security.spec.InvalidKeySpecException
     *
     * @throws java.security.NoSuchAlgorithmException
     *
     * @throws javax.crypto.NoSuchPaddingException
     *
     */
    public void setPassword(String password) throws FacesException {

        try {
              MessageDigest sha = MessageDigest.getInstance("SHA-256");
              byte[] shaKey = sha.digest(password.getBytes(StandardCharsets.UTF_8));
              byte[] finalKey = Arrays.copyOf(shaKey, 16); 
              SecretKeySpec secretKey = new SecretKeySpec(finalKey, "AES");
              
              Cipher encripter = Cipher.getInstance("AES/ECB/PKCS5Padding");
              encripter.init(Cipher.ENCRYPT_MODE, secretKey);
              
              Cipher decripter = Cipher.getInstance("AES/ECB/PKCS5Padding");
              decripter.init(Cipher.DECRYPT_MODE, secretKey);

        } catch (Exception e) {
            throw new FacesException("Error set encryption key", e);
        }
    }

    public String decode(String str) throws Exception {
        byte[] src = str.getBytes(StandardCharsets.UTF_8);
        byte[] utf8 = decode(src);

        // Decode using utf-8
        return new String(utf8, StandardCharsets.UTF_8);
    }

    public String encode(String str) throws Exception {

        byte[] src = str.getBytes(StandardCharsets.UTF_8);

        byte[] utf8 = encode(src);
        // Decode using utf-8
        return new String(utf8, StandardCharsets.UTF_8);
    }

    public byte[] decode(byte[] src) throws Exception {
        byte[] dec = URL64Codec.decodeBase64(src);

        // Decrypt
        if (null != decripter) {
            return decripter.doFinal(dec);
        } else {
            return dec;
        }
    }

    public byte[] encode(byte[] src) throws Exception {
        byte[] dec;

        if (null != encripter) {
            dec = encripter.doFinal(src);
        } else {
            dec = src;
        }

        // Decrypt
        return URL64Codec.encodeBase64(dec);
    }
}
