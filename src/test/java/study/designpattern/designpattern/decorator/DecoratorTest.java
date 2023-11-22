package study.designpattern.designpattern.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DecoratorTest {

    @Test
    void pizza_topping_with_decorator_pattern() {

        Pizza pepperoniPizza = new PepperoniPizza();
        Assertions.assertEquals("PepperoniPizza", pepperoniPizza.getDescription());

        Pizza pepperoniPizzaWithCheeseTopping = new PepperoniPizza();
        pepperoniPizzaWithCheeseTopping = new CheeseTopping(pepperoniPizzaWithCheeseTopping);
        Assertions.assertEquals("PepperoniPizza, CheeseTopping", pepperoniPizzaWithCheeseTopping.getDescription());

        Pizza mushroomPizzaWithCheeseAndCorn = new MushroomPizza();
        mushroomPizzaWithCheeseAndCorn = new CheeseTopping(mushroomPizzaWithCheeseAndCorn);
        mushroomPizzaWithCheeseAndCorn = new CornTopping(mushroomPizzaWithCheeseAndCorn);
        Assertions.assertEquals("MushroomPizza, CheeseTopping, cornTopping", mushroomPizzaWithCheeseAndCorn.getDescription());
        Assertions.assertEquals(19000, mushroomPizzaWithCheeseAndCorn.cost());

    }

}