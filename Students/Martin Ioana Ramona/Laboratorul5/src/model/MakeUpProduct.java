package model;

import java.util.Objects;

public class MakeUpProduct extends Product{
    private boolean dermatologyTested;
    private boolean fragranceFree;

    public MakeUpProduct(String nameOfTheProduct, float priceOfTheProduct, int expirationDateInMonths, String brandOfTheProduct,
                         boolean dermatologyTested, boolean fragranceFree) {
        super(nameOfTheProduct, priceOfTheProduct, expirationDateInMonths, brandOfTheProduct);
        this.dermatologyTested=dermatologyTested;
        this.fragranceFree=fragranceFree;
    }

    public boolean isDermatologyTested() {
        return dermatologyTested;
    }

    public void setDermatologyTested(boolean dermatologyTested) {
        this.dermatologyTested = dermatologyTested;
    }

    public boolean isFragranceFree() {
        return fragranceFree;
    }

    public void setFragranceFree(boolean fragranceFree) {
        this.fragranceFree = fragranceFree;
    }

    @Override
    public String toString() {
        return "MakeUpProduct{" +
                "nameOfTheProduct='" + getNameOfTheProduct() + '\'' +
                ", priceOfTheProduct=" + getPriceOfTheProduct() + '\'' +
                ", expirationDateInMonths=" + getExpirationDateInMonths() + '\'' +
                ", brandOfTheProduct='" + getBrandOfTheProduct() + '\'' +
                ", dermatologyTested=" + dermatologyTested + '\'' +
                ", fragranceFree=" + fragranceFree + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MakeUpProduct that = (MakeUpProduct) o;
        return dermatologyTested == that.dermatologyTested && fragranceFree == that.fragranceFree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dermatologyTested, fragranceFree);
    }
}
