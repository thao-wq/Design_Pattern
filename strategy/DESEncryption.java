package strategy;

public class DESEncryption implements EncryptionStrategy {

    @Override
    public void encrypt(String text) {
        System.out.println("Encrypting using DES: " + text);
    }
}