package _spooler;

public class PrintSpooler {

    private static volatile PrintSpooler instance;

    private PrintSpooler() {
        init();
    }

    private void init() {
        System.out.println("Initializing PrintSpooler...");
    }

    public static PrintSpooler getInstance() {
        if (instance == null) { 
            synchronized (PrintSpooler.class) {
                if (instance == null) { 
                    instance = new PrintSpooler();
                }
            }
        }
        return instance;
    }

    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}