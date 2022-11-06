public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void setQuack(QuackBehaviour newQuack) {
        quackBehaviour = newQuack;
    }

    public void setFly(FlyBehaviour newFly) {
        flyBehaviour = newFly;
    }

    public abstract void display();
}
