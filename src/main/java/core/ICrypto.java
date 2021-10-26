package core;

public interface ICrypto {
    public String encrypt(String str);
    public String decrypt(String str);
    public void encrypt(String inputFile, String outputFile);
    public void decrypt(String inputFile, String outputFile);
}
