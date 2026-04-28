package HomeWork3.Decorator;

public class MilkDecorator implements Coffee{

    protected Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription(){
        return coffee.getDescription() + ", молоко";
    }

    public int cost(){
        return coffee.cost() + 20;
    }
}
