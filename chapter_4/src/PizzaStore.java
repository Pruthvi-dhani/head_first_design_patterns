// factory method pattern
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        // this method is oblivious to the type of pizza returned by createPizza since we have defined a common
        // interface
        // we can say that this method is decoupled from createPizza method
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
//        System.out.println(pizza);
        return pizza;
    }

    // this is the crux of the factory pattern method, we allow inheritance to define the type of Pizza to be returned
    // rather than defining it in the orderPizza method above, this way we can decouple what we want to do with an
    // object and the creation of an object
    public abstract Pizza createPizza(String type);

}
