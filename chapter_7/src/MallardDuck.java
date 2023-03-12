public class MallardDuck implements Duck {

    @Override
    public void fly() {
        System.out.println("MallardDuck flies...");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck quacks...");
    }
}
