public class Test {

    public static void main(String[] args) {
        // main driver code to test out our new classes
        Duck someDuck = new RubberDuck();
        someDuck.setFly(new FlyWithWings());
        someDuck.setQuack(new CanQuack());
        someDuck.display();
        someDuck.performFly();
        someDuck.performQuack();
        someDuck.setQuack(new CannotQuack());
        someDuck.performQuack();
        someDuck.setFly(new FlyNoWay());
        someDuck.performFly();
    }
}
