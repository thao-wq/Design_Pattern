package strategy;

public class EncryptionContext {

    private EncryptionStrategy strategy;

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encryptData(String text) {

        if(strategy == null) {
            System.out.println("No encryption strategy selected!");
            return;
        }

        strategy.encrypt(text);
    }
}