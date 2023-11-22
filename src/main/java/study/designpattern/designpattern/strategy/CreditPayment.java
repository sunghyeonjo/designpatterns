package study.designpattern.designpattern.strategy;

import java.util.List;

public class CreditPayment implements PaymentStrategy {

    @Override
    public void pay(List<Item> itemList) {

        int totalPrice = itemList.stream().mapToInt(Item::getPrice).sum();

        System.out.println("finalPrice = " + totalPrice);
    }

}
