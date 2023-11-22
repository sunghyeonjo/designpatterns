package study.designpattern.designpattern.strategy;

import java.util.List;

public interface PaymentStrategy {

    void pay(List<Item> itemList);

}
