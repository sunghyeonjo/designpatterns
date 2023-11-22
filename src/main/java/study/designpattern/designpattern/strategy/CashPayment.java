package study.designpattern.designpattern.strategy;

import java.util.List;

public class CashPayment implements PaymentStrategy {

    private static final double discountRate = 0.05;

    @Override
    public void pay(List<Item> itemList) {

        int totalPrice = itemList.stream().mapToInt(Item::getPrice).sum();
        final double finalPrice = totalPrice - (totalPrice * discountRate);

        System.out.println("finalPrice = " + finalPrice);
    }
}
