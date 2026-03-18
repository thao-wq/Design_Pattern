package _spooler;

public class Client {
    public static void main(String[] args) {

        PrintSpooler ps1 = PrintSpooler.getInstance();
        PrintSpooler ps2 = PrintSpooler.getInstance();

        ps1.print("Document 1");
        ps2.print("Document 2");

        System.out.println("Same instance? " + (ps1 == ps2));
    }
}