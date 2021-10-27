package lab4;

public class Category {
	private String name;
	Category(String name){
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean equals(Category c) {
		return this.name.equals(c.name);
	}
	
}
