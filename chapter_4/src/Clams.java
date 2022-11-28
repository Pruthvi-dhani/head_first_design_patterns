public abstract class Clams {
    String clamsName;

    @Override
    public String toString() {
        return clamsName == null ? "null" : "Clams" + clamsName;
    }

    public void setClamsName(String clamsName) {
        this.clamsName = clamsName;
    }
}
