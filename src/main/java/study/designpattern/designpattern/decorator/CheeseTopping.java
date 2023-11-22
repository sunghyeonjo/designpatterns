package study.designpattern.designpattern.decorator;

public class CheeseTopping extends ToppingsDecorator {

    public CheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", CheeseTopping";
    }

    public double cost() {
        return pizza.cost() + 3000;
    }

}
