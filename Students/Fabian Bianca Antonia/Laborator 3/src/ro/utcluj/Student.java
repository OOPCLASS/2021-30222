package ro.utcluj;

import java.util.Random;

public class Student 
{
	String uniqueIdentificationNumber;
	String lastName;
	String firstName;
	Student contactPerson;
	Course[] studentsCourses;
	
	public Student()
	{
		uniqueIdentificationNumber="123";
		lastName="last";
		firstName="first";
		studentsCourses= new Course[5];
	}
	public Student(String firstName, String lastName, String uniqueIdentificationNumber)
	{
		this.uniqueIdentificationNumber=uniqueIdentificationNumber;
		this.lastName=lastName;
		this.firstName=firstName;
		studentsCourses= new Course[GetRandomNumber(6)];
	}
	public Student(String firstName, String lastName)
	{ 
		uniqueIdentificationNumber=""+GetRandomNumber(1000);
		this.lastName=lastName;
		this.firstName=firstName;
		studentsCourses= new Course[GetRandomNumber(6)];
	}
	public String getName()
	{
		return firstName + " " +lastName;
	}
	private int GetRandomNumber(int maxNumber)
	{
		Random rnd = new Random();
		return rnd.nextInt(maxNumber);
		
	}
}
