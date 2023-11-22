package study.designpattern.designpattern.decorator;

public class MushroomPizza extends Pizza {

    public MushroomPizza() {
        description = "MushroomPizza";
    }

    public double cost() {
        return 15000;
    }
}
