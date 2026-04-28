package HomeWork3.Decorator;

public class SimpleCoffee implements Coffee{

    public String getDescription(){
        return "Простой кофе";
    }

    public int cost(){
        return 50;
    }
}
