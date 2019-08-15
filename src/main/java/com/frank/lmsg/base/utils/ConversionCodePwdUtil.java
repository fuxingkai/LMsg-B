package com.frank.lmsg.base.utils;

/**
 * Description: 兑换码密码生成工具
 * Auth: Frank
 * Date: 2017-11-21
 * Time: 下午 3:44
 */
public class ConversionCodePwdUtil {
    private static final int CODE_LENGTH = 8;//code长度

    /**
     * 获得随机兑换码密码
     * @return
     * @throws Exception
     */
    public static String getRandomCodePwd() throws Exception {
        return StringRandomUtil.getStringRandom(CODE_LENGTH);
    }

    /**
     *  对兑换码密码进行加密
     * @param pwd 兑换码明文
     * @param key 加密key
     * @return
     * @throws Exception
     */
    public static String encodeCodePwd(String pwd,String key) throws Exception {
        String kaisaCipherCodePwd = KaisaCodeUtil.encodeKaisa(pwd,key.length());
        String atbashCipherCodePwd = AtbashUtil.encodeAtbash(kaisaCipherCodePwd);
        return Base64Util.encryptBASE64(AesUtil.encrypt(atbashCipherCodePwd.getBytes(),AesUtil.initKey(key)));
    }

    /**
     *  对兑换码密码进行解密
     * @param cipherCode 加密密码
     * @param key 解密密码
     * @return
     * @throws Exception
     */
    public static String decodeCodeCodePwd(String cipherCode,String key) throws Exception {
        byte[] aesPwdData = AesUtil.decrypt(Base64Util.decryptBASE64(cipherCode),AesUtil.initKey(key));
        String aesClearCodePwd = new String(aesPwdData);
        String atbashClearCodePwd = AtbashUtil.decodeAtbash(aesClearCodePwd);
        String kaisaClearCodePwd = KaisaCodeUtil.decodeKaisa(atbashClearCodePwd,key.length());
        return kaisaClearCodePwd;
    }

    public static void main(String[] args) throws Exception {
        String codePwd = getRandomCodePwd();
        System.out.println("codePwd:"+codePwd);
        String eCodePwd = encodeCodePwd(codePwd,"Frank");
        System.out.println("ecodePwd:"+eCodePwd);
        String dCodePwd = decodeCodeCodePwd(eCodePwd,"Frank");
        System.out.println("dCodePwd:"+dCodePwd);
    }
}
