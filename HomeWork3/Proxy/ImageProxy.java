package HomeWork3.Proxy;

public class ImageProxy implements Image{

    private RealImage realImage;
    private final String file;

    public ImageProxy(String file) {
        this.file = file;
    }

    public void display() {
        if(realImage == null){
            realImage = new RealImage(file);
        }
        realImage.display();
    }
}
