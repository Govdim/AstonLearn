package HomeWork3.Strategy;

public class StrategyDemo{

    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        service.setStrategy(new CardPayment());
        service.process(100);

        service.setStrategy(new PayPalPayment());
        service.process(200);
    }
}
