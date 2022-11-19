// this is the base class that all beverages will inherit from
// this common supertype is what makes the constructing new objects by wrapping around existing ones work
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
