package proxy;

public class ImageGallery {
    public static void main(String[] args) {

        DisplayObject img1 = new ImageProxy("img1.jpg");
        DisplayObject img2 = new ImageProxy("img2.jpg");

        System.out.println("App started...");


        img1.display(); 
        img1.display(); 

        img2.display(); 
    }
}