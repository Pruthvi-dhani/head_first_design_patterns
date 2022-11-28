public abstract class Cheese {
    String cheeseName;

    @Override
    public String toString() {
        return cheeseName == null ? "null" : "Cheese: " + cheeseName;
    }

    public void setCheeseName(String cheeseName) {
        this.cheeseName = cheeseName;
    }
}
