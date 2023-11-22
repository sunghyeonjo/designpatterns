package study.designpattern.designpattern.factorymethod;

public class EmployeePaymentFactory extends PaymentFactory {

    @Override
    Payment createPayment(PaymentType paymentType) {
        Payment payment = null;

        if (paymentType.equals(PaymentType.CASH)) {
            payment = new CashPayment("EmployeeA");
        } else if (paymentType.equals(PaymentType.CREDIT)) {
            payment = new CreditCardPayment("EmployeeB");
        } else if (paymentType.equals(PaymentType.DEBIT)) {
            payment = new DebitCardPayment("EmployeeC");
        } else {
            throw new IllegalArgumentException("No matched payment.");
        }

        return payment;
    }
}
