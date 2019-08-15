package com.frank.lmsg.base.utils;

/**
 * Description: 兑换码生成工具
 * Auth: Frank
 * Date: 2017-10-26
 * Time: 下午 3:44
 */
public class ConversionCodeUtil {
    private static final int CODE_LENGTH = 8;//code长度

    /**
     * 获得随机兑换码
     * @return
     * @throws Exception
     */
    public static String getRandomCode() throws Exception {
        return StringRandomUtil.getStringRandom(CODE_LENGTH);
    }

    /**
     * 对兑换码进行加密
     * @param code 兑换码明文
     * @return
     * @throws Exception
     */
    public static String encodeCode(String code) throws Exception {
        String atbashCipherCode = AtbashUtil.encodeAtbash(code);
        return Base64Util.encryptBASE64(atbashCipherCode.getBytes());
    }

    /**
     * 对兑换码进行解密
     * @param cipherCode
     * @return
     * @throws Exception
     */
    public static String decodeCode(String cipherCode) throws Exception {
        String baseCode = new String(Base64Util.decryptBASE64(cipherCode));
        String atbashClearCode = AtbashUtil.decodeAtbash(baseCode);
        return atbashClearCode;
    }

    public static void main(String[] args) throws Exception {
        String code = getRandomCode();
        System.out.println("code:"+code);
        String ecode = encodeCode(code);
        System.out.println("ecode:"+ecode);
        String dcode = decodeCode(ecode);
        System.out.println("dcode:"+dcode);
    }
}
