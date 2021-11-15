package ro.utcluj;

public class Pokemon extends Cards {
public String material;

public String getMaterial() {
	return material;
}

public void setMaterial(String material) {
	this.material = material;
}

public Pokemon(int pieces, String material) {
	super(pieces);
	this.material = material;
}


}
