public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza(chicagoPizzaIngredientFactory);
            pizza.setName("chicago cheese pizza");
        }
        else if (type.equals("clams")) {
            pizza = new ClamPizza(chicagoPizzaIngredientFactory);
            pizza.setName("chicago clams pizza");
        }
        else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(chicagoPizzaIngredientFactory);
            pizza.setName("chicago pepperoni pizza");
        }
        else if (type.equals("veggie")) {
            pizza = new VeggiePizza(chicagoPizzaIngredientFactory);
            pizza.setName("chicago veggie pizza");
        }
        return pizza;
    }

}
