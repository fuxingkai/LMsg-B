package com.frank.lmsg.base.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.security.NoSuchAlgorithmException;

/**
 * Description:BASE64 加密工具类
 * Auth: Frank
 * Date: 2017-10-26
 * Time: 下午 3:29
 */
public class Base64Util {

    /**
     * BASE64解密
     *
     * @param key
     * @return
     * @throws Exception
     */
    public static byte[] decryptBASE64(String key) throws Exception {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    /**
     * BASE64加密
     *
     * @param key
     * @return
     * @throws Exception
     */
    public static String encryptBASE64(byte[] key) throws Exception {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    public static void main(String[] args) {
        String clearStr = "12yyyy34567890-=rtyuiodsfsdfsdfklmsfmsdflmsdafsdfsdfsdfwerrwerpteoryym/,ppdksdfldfsdlkmmsdf6783$%#!~!#$%^&*&(FRANKfrank22411";
        String clearMd5 = null;
        try {
            clearMd5 = Md5Util.md5Hex(clearStr);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String cipherStr = null;
        try {
            cipherStr = encryptBASE64(clearMd5.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("原文："+clearStr);
        System.out.println("md5："+clearMd5);
        System.out.println("base64："+cipherStr.trim());
        System.out.println("base64长度："+cipherStr.trim().length());
    }
}
