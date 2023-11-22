package study.designpattern.designpattern.factorymethod;

public class Counter {

    private PaymentFactory paymentFactory;

    public Counter(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    public void processPayment(PaymentType paymentType, double cost) {
        Payment payment = paymentFactory.createPayment(paymentType);
        payment.pay(cost);
    }
}
