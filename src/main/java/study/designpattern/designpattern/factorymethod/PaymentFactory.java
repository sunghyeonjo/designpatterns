package study.designpattern.designpattern.factorymethod;

public abstract class PaymentFactory {

    abstract Payment createPayment(PaymentType paymentType);

}
