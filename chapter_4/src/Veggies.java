public abstract class Veggies {
    String veggiesName;

    public String getVeggiesName() {
        return veggiesName;
    }

    public void setVeggiesName(String veggiesName) {
        this.veggiesName = veggiesName;
    }

    @Override
    public String toString() {
        return "Veggies: " + veggiesName;
    }
}
