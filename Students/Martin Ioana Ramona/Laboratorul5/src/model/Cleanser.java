package model;

import java.util.Objects;

public class Cleanser extends SkincareProduct {
    private boolean oilFree;
    private String effect;


    public Cleanser(String nameOfTheProduct, float priceOfTheProduct, int expirationDateInMonths, String brandOfTheProduct,
                    String skinType, boolean fragranceFree, boolean oilFree, String effect) {
        super(nameOfTheProduct, priceOfTheProduct, expirationDateInMonths, brandOfTheProduct, skinType, fragranceFree);
        this.oilFree=oilFree;
        this.effect=effect;
    }

    public boolean isOilFree() {
        return oilFree;
    }

    public void setOilFree(boolean oilFree) {
        this.oilFree = oilFree;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        return "Cleanser{" +
                "nameOfTheProduct='" + getNameOfTheProduct() + '\'' +
                ", priceOfTheProduct=" + getPriceOfTheProduct() + '\'' +
                ", expirationDateInMonths=" + getExpirationDateInMonths() + '\'' +
                ", brandOfTheProduct='" + getBrandOfTheProduct() + '\'' +
                ", skinType='" + getSkinType() + '\'' +
                ", fragranceFree=" + isFragranceFree() + '\'' +
                ", oilFree=" + oilFree + '\'' +
                ", effect='" + effect + '\'' +
                '}';
    }

    public void isThisForOilySkin(boolean oilFree){
        if(oilFree) System.out.println("yes, it may be");
        else System.out.println("no, it's not");
    }

    public void isThisForOilySkin(String effect){
        if(effect.equals("mattifying")) System.out.println("yes, it is");
        else System.out.println("no, it's not");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cleanser cleanser = (Cleanser) o;
        return oilFree == cleanser.oilFree && Objects.equals(effect, cleanser.effect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), oilFree, effect);
    }
}
