package ro.uctlcuj.bond;

import java.util.ArrayList;
import java.util.Random;

public class Student {
	public String firstName;
	public String lastName;
	public String uniqueIdentificationNumber;
	ArrayList<Course> attendedCourses = new ArrayList<Course>();

	
	
	
	public String randomeUIN () {//returns a string made of 2 characters followed by 6 digits  
		Random rand=new Random();
		int sixDigitsNr=rand.nextInt(89999)+100000;///random number between 100000 and 999999
		char randomChars[]= { (char)(rand.nextInt(26)+'A'), (char)(rand.nextInt(26)+'A')};
		return String.valueOf(randomChars)+String.valueOf(sixDigitsNr);
	}
	
	public Student() {///Random constructor
		NameGenerator rndName=new NameGenerator();
		Random rand=new Random();
		firstName=rndName.getName();
		rndName.length=rand.nextInt(7)+3;/// I want lastName and firstName to have different lengths
		lastName=rndName.getName();
		uniqueIdentificationNumber=randomeUIN();
	}
	
	public Student(String firstName, String lastName, String uniqueIdentificationNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.uniqueIdentificationNumber=uniqueIdentificationNumber;
	}
	public void joinCourse(Course newCourse) {
		if(!attendedCourses.contains(newCourse))
			attendedCourses.add(newCourse);
	}
	public void presentMyself (){
		System.out.print(firstName + " " +lastName+ " " + uniqueIdentificationNumber);
		if(attendedCourses.size()>0) {
			System.out.print(" courses: ");
			for(Course courseIndex: attendedCourses)
				System.out.print(courseIndex.name+", ");
		}
		System.out.println();
	}	
}
