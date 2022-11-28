public class Main {
    public static void main(String[] args) {
        // create ny pizza
        PizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        nyPizzaStore.orderPizza("clams");
        nyPizzaStore.orderPizza("pepperoni");
        nyPizzaStore.orderPizza("veggie");
        // create chicago pizza store
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("clams");
        chicagoPizzaStore.orderPizza("pepperoni");
        chicagoPizzaStore.orderPizza("veggie");
    }
}
