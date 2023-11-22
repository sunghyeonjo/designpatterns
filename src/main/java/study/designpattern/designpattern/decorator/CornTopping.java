package study.designpattern.designpattern.decorator;

public class CornTopping extends ToppingsDecorator {

    public CornTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", cornTopping";
    }

    public double cost() {
        return pizza.cost() + 1000;
    }

}
