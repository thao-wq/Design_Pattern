package command;

public class Curtain {
    private int position = 100;

    public void up() {
        position = 100;
        System.out.println("Curtain UP");
    }

    public void down() {
        position = 0;
        System.out.println("Curtain DOWN");
    }

    public void setPosition(int pos) {
        position = pos;
        System.out.println("Curtain at " + pos + "%");
    }

    public int getPosition() {
        return position;
    }
}