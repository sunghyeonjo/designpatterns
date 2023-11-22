package study.designpattern.designpattern.factorymethod;

public class CreditCardPayment implements Payment{

    private final String tx_id;

    public CreditCardPayment(String tx_id) {
        this.tx_id = tx_id;
    }

    @Override
    public void pay(double cost) {
        System.out.println("pay with credit card, cost = " + cost);
    }

    @Override
    public void refund(double cost, Receipt receipt) {
        validateReceipt(receipt);
        System.out.println("refund with credit card, cost = " + cost);
    }
}
