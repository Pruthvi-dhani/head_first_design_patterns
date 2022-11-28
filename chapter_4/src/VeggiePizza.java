import java.util.Arrays;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        dough = pizzaIngredientFactory.createDough();
        System.out.println(dough);
        sauce = pizzaIngredientFactory.createSauce();
        System.out.println(sauce);
        cheese = pizzaIngredientFactory.createCheese();
        System.out.println(cheese);
        veggies = pizzaIngredientFactory.createVeggies();
        System.out.println(Arrays.toString(veggies));
    }

}
