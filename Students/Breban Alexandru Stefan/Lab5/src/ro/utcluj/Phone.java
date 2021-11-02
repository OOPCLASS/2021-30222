package ro.utcluj;

public class Phone extends Electronic {
public int memoryStorage;


public int getMemoryStorage() {
	return memoryStorage;
}

public void setMemoryStorage(int memoryStorage) {
	this.memoryStorage = memoryStorage;
}


public Phone(float reviews, String brand, int memoryStorage) {
	super(reviews, brand);
	this.memoryStorage = memoryStorage;
}




}
