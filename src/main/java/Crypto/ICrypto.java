package Crypto;

import javax.crypto.NoSuchPaddingException;
import java.security.NoSuchAlgorithmException;

public interface ICrypto {
    public String encrypt(String str) throws Exception;
    public String decrypt(String str) throws Exception;
    public void encrypt(String inputFile, String outputFile);
    public void decrypt(String inputFile, String outputFile);
}
