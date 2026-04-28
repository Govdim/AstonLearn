package HomeWork3.Proxy;

public class ProxyDemo{

    public static void main(String[] args){
        Image image = new ImageProxy("photo.png");

        image.display();
        image.display();
    }
}
