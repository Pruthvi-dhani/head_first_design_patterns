import java.util.Arrays;

public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
        pepperoni = pizzaIngredientFactory.createPepperoni();
        System.out.println(pepperoni);
        veggies = pizzaIngredientFactory.createVeggies();
        System.out.println(Arrays.toString(veggies));
    }

}
