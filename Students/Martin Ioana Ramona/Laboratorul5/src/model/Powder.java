package model;

import java.util.Objects;

public class Powder extends MakeUpProduct{
    private String shadeOfThePowder;
    private String typeOfThePowder;

    public Powder(String nameOfTheProduct, float priceOfTheProduct, int expirationDateInMonths, String brandOfTheProduct,
                  boolean dermatologyTested, boolean fragranceFree, String shadeOfThePowder, String typeOfThePowder) {
        super(nameOfTheProduct, priceOfTheProduct, expirationDateInMonths, brandOfTheProduct, dermatologyTested, fragranceFree);
        this.shadeOfThePowder=shadeOfThePowder;
        this.typeOfThePowder=typeOfThePowder;
    }

    public String getShadeOfThePowder() {
        return shadeOfThePowder;
    }

    public void setShadeOfThePowder(String shadeOfThePowder) {
        this.shadeOfThePowder = shadeOfThePowder;
    }

    public String getTypeOfThePowder() {
        return typeOfThePowder;
    }

    public void setTypeOfThePowder(String typeOfThePowder) {
        this.typeOfThePowder = typeOfThePowder;
    }

    @Override
    public String toString() {
        return "Powder{" +
                "nameOfTheProduct='" + getNameOfTheProduct() + '\'' +
                ", priceOfTheProduct=" + getPriceOfTheProduct() + '\'' +
                ", expirationDateInMonths=" + getExpirationDateInMonths() + '\'' +
                ", brandOfTheProduct='" + getBrandOfTheProduct() + '\'' +
                ", dermatologyTested=" + isDermatologyTested() + '\'' +
                ", fragranceFree=" + isFragranceFree() + '\'' +
                ", shadeOfThePowder='" + shadeOfThePowder + '\'' +
                ", typeOfThePowder='" + typeOfThePowder + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Powder powder = (Powder) o;
        return Objects.equals(shadeOfThePowder, powder.shadeOfThePowder) && Objects.equals(typeOfThePowder, powder.typeOfThePowder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), shadeOfThePowder, typeOfThePowder);
    }
}
