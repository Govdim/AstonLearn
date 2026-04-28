package HomeWork3.Strategy;

public class PayPalPayment implements PaymentStrategy{

    public void pay(int amount){
        System.out.println("Оплата через PayPal: " + amount);
    }
}
