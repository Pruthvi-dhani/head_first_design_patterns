public class CannotQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Cannot quack like a duck!");
    }
}
