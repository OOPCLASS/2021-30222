package model;

import java.util.Objects;

public class MoisturisingCream extends SkincareProduct{
    private int hydratingLevel;

    public MoisturisingCream(String nameOfTheProduct, float priceOfTheProduct, int expirationDateInMonths, String brandOfTheProduct,
                             String skinType, boolean fragranceFree, int hydratingLevel) {
        super(nameOfTheProduct, priceOfTheProduct, expirationDateInMonths, brandOfTheProduct, skinType, fragranceFree);
        this.hydratingLevel=hydratingLevel;
    }

    public int getHydratingLevel() {
        return hydratingLevel;
    }

    public void setHydratingLevel(int hydratingLevel) {
        this.hydratingLevel = hydratingLevel;
    }

    @Override
    public String toString() {
        return "MoisturisingCream{" +
                "nameOfTheProduct='" + getNameOfTheProduct() + '\'' +
                ", priceOfTheProduct=" + getPriceOfTheProduct() + '\'' +
                ", expirationDateInMonths=" + getExpirationDateInMonths() + '\'' +
                ", brandOfTheProduct='" + getBrandOfTheProduct() + '\'' +
                ", skinType='" + getSkinType() + '\'' +
                ", fragranceFree=" + isFragranceFree() + '\'' +
                ", hydratingLevel=" + hydratingLevel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MoisturisingCream that = (MoisturisingCream) o;
        return hydratingLevel == that.hydratingLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hydratingLevel);
    }
}
