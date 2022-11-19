public class Main {

    public static void main(String[] args) {
        // get a concrete coffee object that we will decorate with condiments
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        System.out.println("Current beverage: " + beverage.getDescription());
        System.out.println("Current beverage cost: " + beverage.cost());
    }
}
