import Crypto.AESCrypto;

public class MainClass {
    public static void main(String[] args){
        AESCrypto aes = new AESCrypto("1234567890123456");
        try {
            String base64 = aes.encrypt("Plain text to encrypt 1234567890123235467");
            System.out.println("Encrypted Base64::" + base64);

            String plainText = aes.decrypt(base64);
            System.out.println("Plain Text::" + plainText);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
