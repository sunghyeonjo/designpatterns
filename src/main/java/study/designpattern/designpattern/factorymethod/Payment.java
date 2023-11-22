package study.designpattern.designpattern.factorymethod;

public interface Payment {

    void pay(double cost);

    void refund(double cost, Receipt receipt);

    default void validateReceipt(Receipt receipt) {
        System.out.println("receipt validation!");
    }

}
