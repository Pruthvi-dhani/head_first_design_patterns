public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // we can add modification to existing behaviour as well
        for(int i = 0; i < 5; i++)
            turkey.fly();
    }
}
