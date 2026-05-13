package strategy;

public class AESEncryption implements EncryptionStrategy {

    @Override
    public void encrypt(String text) {
        System.out.println("Encrypting using AES: " + text);
    }
}
