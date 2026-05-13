package strategy;

public class RSAEncryption implements EncryptionStrategy {

    @Override
    public void encrypt(String text) {
        System.out.println("Encrypting using RSA: " + text);
    }
}