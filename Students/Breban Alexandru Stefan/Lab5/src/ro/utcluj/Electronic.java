package ro.utcluj;

public class Electronic extends Product {
public float reviews;
public String brand;


public float getReviews() {
	return reviews;
}


public void setReviews(float reviews) {
	this.reviews = reviews;
}


public String getBrand() {
	return brand;
}


public void setBrand(String brand) {
	this.brand = brand;
}


public Electronic(float reviews, String brand) {
	super();
	this.reviews = reviews;
	this.brand = brand;
}




}
