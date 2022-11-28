public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public String getName() {
        return name == null ? "null" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println("Baking: " + name);
    }

    public void cut() {
        System.out.println("Cutting: " + name);
    }

    public void box() {
        System.out.println("Boxing: " + name);
    }

//    @Override
//    public String toString() {
//        return "name: " + getName() + " dough: " + dough.getDoughName() + " sauce: " + sauce.getSauceName()
//        + " cheese: " + cheese.getCheeseName() + " veggies: " + (veggies == null ? "null" : Arrays.toString(veggies))
//                + " pepperoni: " + pepperoni.getPepperoniName() + " clams: " + clams.getClamsName();
//    }


}
