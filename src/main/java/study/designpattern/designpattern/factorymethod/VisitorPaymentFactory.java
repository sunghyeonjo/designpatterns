package study.designpattern.designpattern.factorymethod;

public class VisitorPaymentFactory extends PaymentFactory {

    @Override
    Payment createPayment(PaymentType paymentType) {
        Payment payment = null;

        if (paymentType.equals(PaymentType.CASH)) {
            payment = new CashPayment("VisitorA");
        } else if (paymentType.equals(PaymentType.CREDIT)) {
            payment = new CreditCardPayment("VisitorB");
        } else if (paymentType.equals(PaymentType.DEBIT)) {
            payment = new DebitCardPayment("VisitorC");
        } else {
            throw new IllegalArgumentException("No matched payment.");
        }

        return payment;
    }
}
