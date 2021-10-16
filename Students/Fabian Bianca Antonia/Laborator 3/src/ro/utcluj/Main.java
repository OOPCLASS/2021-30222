package ro.utcluj;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException 
	{
		StudentRegistry studentRegistry = new StudentRegistry(10);
		Path fileName = Path.of("src/ro/utcluj/students.txt");
		List<String> fileContent = Files.readAllLines(fileName);
		for (String line : fileContent) 
		{
			String[] lineWords = line.split(" ");
		    String lastName = lineWords[0];
		    String firstName = lineWords[1];
		    studentRegistry.AddStudent(new Student(firstName, lastName));
		}
		studentRegistry.ViewStudents();
		studentRegistry.ViewStudent(0);
		
	
		fileName = Path.of("src/ro/utcluj/courses.txt");
		fileContent = Files.readAllLines(fileName);
		Course[] courses = new Course[fileContent.size()];
		int indexOfCourse=0;
		for (String line : fileContent) 
		{
			String[] lineWords = line.split(" ");
		    String courseName = lineWords[0];
		    int creditsNumber = Integer.parseInt(lineWords[1]);
		    int[] roomNumbers = new int[lineWords.length-2];
		    for(int i=2;i<lineWords.length;i++)
		    {
		    	roomNumbers[i-2]=Integer.parseInt(lineWords[i]);
		    }
		    courses[indexOfCourse] = new Course(courseName, creditsNumber, roomNumbers);
		    indexOfCourse++;
		}
		for(int i=0;i<courses.length;i++)
		{
			System.out.println(courses[i].getCourse());
		}
	}

}
