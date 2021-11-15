package model;

import java.util.Objects;

public class Lipstick extends MakeUpProduct{
    private String colorOfLipstick;
    private String typeOfLipstick;

    public Lipstick(String nameOfTheProduct, float priceOfTheProduct, int expirationDateInMonths, String brandOfTheProduct,
                    boolean dermatologyTested, boolean fragranceFree, String colorOfLipstick, String typeOfLipstick) {
        super(nameOfTheProduct, priceOfTheProduct, expirationDateInMonths, brandOfTheProduct, dermatologyTested, fragranceFree);
        this.colorOfLipstick=colorOfLipstick;
        this.typeOfLipstick=typeOfLipstick;
    }

    public String getColorOfLipstick() {
        return colorOfLipstick;
    }

    public String getTypeOfLipstick() {
        return typeOfLipstick;
    }

    public void setColorOfLipstick(String colorOfLipstick) {
        this.colorOfLipstick = colorOfLipstick;
    }

    public void setTypeOfLipstick(String typeOfLipstick) {
        this.typeOfLipstick = typeOfLipstick;
    }

    @Override
    public String toString() {
        return "Lipstick{" +
                "nameOfTheProduct='" + getNameOfTheProduct() + '\'' +
                ", priceOfTheProduct=" + getPriceOfTheProduct() + '\'' +
                ", expirationDateInMonths=" + getExpirationDateInMonths() + '\'' +
                ", brandOfTheProduct='" + getBrandOfTheProduct() + '\'' +
                ", dermatologyTested=" + isDermatologyTested() + '\'' +
                ", fragranceFree=" + isFragranceFree() + '\'' +
                ", colorOfLipstick='" + colorOfLipstick + '\'' +
                ", typeOfLipstick='" + typeOfLipstick + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Lipstick lipstick = (Lipstick) o;
        return Objects.equals(colorOfLipstick, lipstick.colorOfLipstick) && Objects.equals(typeOfLipstick, lipstick.typeOfLipstick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colorOfLipstick, typeOfLipstick);
    }
}
