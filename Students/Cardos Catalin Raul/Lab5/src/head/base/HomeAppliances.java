package head.base;

import head.Products;

public class HomeAppliances extends Products {
    private String energeticClass;

    public String getEnergeticClass() {
        return energeticClass;
    }

    public void setEnergeticClass(String energeticClass) {
        this.energeticClass = energeticClass;
    }

    public HomeAppliances(String name, int price, String energeticClass) {
        super(name, price);
        this.energeticClass = energeticClass;
    }

    public HomeAppliances() {

    }
}
