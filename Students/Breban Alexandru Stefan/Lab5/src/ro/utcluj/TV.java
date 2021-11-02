package ro.utcluj;

public class TV extends Electronic {
public int screenSize;

public int getScreenSize() {
	return screenSize;
}

public void setScreenSize(int screenSize) {
	this.screenSize = screenSize;
}

public TV(float reviews, String brand, int screenSize) {
	super(reviews, brand);
	this.screenSize = screenSize;
}



}
