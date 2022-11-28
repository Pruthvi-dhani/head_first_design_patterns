public class ClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
        clams = pizzaIngredientFactory.createClams();
        System.out.println(clams);
    }

}
