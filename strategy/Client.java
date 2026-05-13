package strategy;

public class Client {

    public static void main(String[] args) {

        EncryptionContext context = new EncryptionContext();

        context.setStrategy(new AESEncryption());
        context.encryptData("Hello World");

        System.out.println();

        context.setStrategy(new DESEncryption());
        context.encryptData("Hello World");

        System.out.println();

        context.setStrategy(new RSAEncryption());
        context.encryptData("Hello World");
    }
}