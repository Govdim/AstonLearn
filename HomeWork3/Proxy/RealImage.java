package HomeWork3.Proxy;

public class RealImage implements Image{

    private final String file;

    public RealImage(String file){
        this.file = file;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Загрузка: " + file);
    }

    public void display(){
        System.out.println("Показ: " + file);
    }
}
