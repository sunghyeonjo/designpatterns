package study.designpattern.designpattern.decorator;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        description = "PepperoniPizza";
    }

    public double cost() {
        return 12000;
    }

}
