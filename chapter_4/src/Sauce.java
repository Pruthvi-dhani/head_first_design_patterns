public abstract class Sauce {
    String sauceName;

    @Override
    public String toString() {
        return sauceName == null ? "null" : "Sauce: " + sauceName;
    }

    public void setSauceName(String sauceName) {
        this.sauceName = sauceName;
    }
}
