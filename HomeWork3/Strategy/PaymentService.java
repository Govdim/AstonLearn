package HomeWork3.Strategy;

public class PaymentService{

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void process(int amount) {
        strategy.pay(amount);
    }
}
