package study.designpattern.designpattern.factorymethod;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(new EmployeePaymentFactory());
        counter.processPayment(PaymentType.CASH, 500);
    }
}
