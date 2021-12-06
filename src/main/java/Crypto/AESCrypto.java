package Crypto;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;


public class AESCrypto implements ICrypto{
    private static final String ALGORITHM = "AES";
    private byte[] keyValue;
    public AESCrypto(String key){
        keyValue = key.getBytes();
    }
    @Override
    public String encrypt(String str) throws Exception{
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE,key);
        byte[] encryptedVal = cipher.doFinal(str.getBytes());
        String encryptedValue = Base64.getEncoder().encodeToString(encryptedVal);
        return encryptedValue;
    }

    private Key generateKey() {
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        return key;
    }

    @Override
    public String decrypt(String base64Str) throws Exception{
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE,key);
        byte[] decryptedVal = Base64.getDecoder().decode(base64Str);
        byte[] decryptedValue = cipher.doFinal(decryptedVal);
        return new String(decryptedValue);
    }

    @Override
    public void encrypt(String inputFile, String outputFile) {

    }

    @Override
    public void decrypt(String inputFile, String outputFile) {

    }
}
