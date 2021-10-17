package ro.uctlcuj.bond;

public class Course {
	String name;
	int creditsNumber;
	int roomNumbers[];
	
	public Course() {
		
	}
	public Course(String name, int cn, int roomNumbers[]) {
		this.name=name;
		creditsNumber=cn;
		this.roomNumbers=roomNumbers;		
	}

}
