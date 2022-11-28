public abstract class Dough {
    String doughName;

    @Override
    public String toString() {
        return doughName == null ? "null" : "Dough: " + doughName;
    }

    public void setDoughName(String doughName) {
        this.doughName = doughName;
    }
}
