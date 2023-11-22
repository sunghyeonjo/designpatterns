package study.designpattern.designpattern.decorator;

public class ChickenPizza extends Pizza {

    public ChickenPizza() {
        description = "ChickenPizza";
    }

    public double cost() {
        return 9900;
    }
}
