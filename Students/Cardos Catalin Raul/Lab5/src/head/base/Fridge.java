package head.base;

public class Fridge extends HomeAppliances {
    private int maxTemperature;
    private int minTemperature;

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public Fridge(String name, int price, String energeticClass, int maxTemperature, int minTemperature) {
        super(name, price, energeticClass);
        this.maxTemperature = maxTemperature;
        this.minTemperature = minTemperature;
    }
}
