// concrete class that every condiment will implement
// note that it inherits from the same supertype to make decorator pattern work
public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;  // the beverage that we will decorate over

    @Override
    public abstract String getDescription();

}
