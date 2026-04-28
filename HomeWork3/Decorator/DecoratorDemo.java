package HomeWork3.Decorator;

public class DecoratorDemo{

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);

        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());
    }
}
