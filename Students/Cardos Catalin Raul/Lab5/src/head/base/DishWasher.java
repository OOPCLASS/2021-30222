package head.base;

public class DishWasher extends HomeAppliances {
    private int compartments;

    public int getCompartments() {
        return compartments;
    }

    public void setCompartments(int compartments) {
        this.compartments = compartments;
    }

    public DishWasher(String name, int price, String energeticClass, int compartments) {
        super(name, price, energeticClass);
        this.compartments = compartments;
    }

    public DishWasher() {

    }
}
