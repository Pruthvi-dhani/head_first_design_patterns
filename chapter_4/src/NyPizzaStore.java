public class NyPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory nyPizzaIngredients = new NyPizzaIngredientFactory();
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(nyPizzaIngredients);
            pizza.setName("ny cheese pizza");
        }
        else if (type.equals("clams")) {
            pizza = new ClamPizza(nyPizzaIngredients);
            pizza.setName("ny clams pizza");
        }
        else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(nyPizzaIngredients);
            pizza.setName("ny pepperoni pizza");
        }
        else if (type.equals("veggie")) {
            pizza = new VeggiePizza(nyPizzaIngredients);
            pizza.setName("ny veggie pizza");
        }
        return pizza;
    }

}
