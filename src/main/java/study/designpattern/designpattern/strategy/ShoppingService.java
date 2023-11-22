package study.designpattern.designpattern.strategy;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingService {

    public void pay(List<Item> itemList, PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(itemList);
    }
}
