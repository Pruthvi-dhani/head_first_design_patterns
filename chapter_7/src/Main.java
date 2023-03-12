public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        // this adapter makes the behaviour of a turkey interface similar to that of a duck interface
        TurkeyAdapter dummyDuck = new TurkeyAdapter(new WildTurkey());
        dummyDuck.quack();
        dummyDuck.fly();
    }
}
