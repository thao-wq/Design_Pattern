package proxy;

public class ImageFile implements DisplayObject {
    private String path;

    public ImageFile(String path) {
        this.path = path;
        load(); 
    }

    private void load() {
        System.out.println("Loading image from disk: " + path);
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + path);
    }
}
