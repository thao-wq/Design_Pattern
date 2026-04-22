package proxy;

public class ImageProxy implements DisplayObject {
    private String path;
    private ImageFile realImage; 

    public ImageProxy(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new ImageFile(path);
        }
        realImage.display();
    }
}
