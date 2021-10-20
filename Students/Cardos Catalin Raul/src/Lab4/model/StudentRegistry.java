package Lab4.model;
import Lab4.model.jos.*;
public class StudentRegistry {
public Student[] Students = new Student[10];
public StudentRegistry()
{
	for(int i = 0; i < Students.length; i++)
	{
		Students[i] = new Student();
	}
	
}
public void addStudent(String firstName, String lastName, int position)
{
Students[position].firstName = firstName;
Students[position].lastName = lastName;
}
public void printStudents(int lengthStudents)
{
	for(int i = 0; i < lengthStudents; i++)
{
	System.out.println(Students[i].firstName + " " + Students[i].lastName);
}
}



}
