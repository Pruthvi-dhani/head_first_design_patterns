public abstract class Pepperoni {
    String pepperoniName;

    @Override
    public String toString() {
        return pepperoniName == null ? "null" : "Pepperoni: " + pepperoniName;
    }

    public void setPepperoniName(String pepperoniName) {
        this.pepperoniName = pepperoniName;
    }
}
