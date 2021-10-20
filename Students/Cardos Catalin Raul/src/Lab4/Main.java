package Lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import Lab4.model.*;
import Lab4.model.jos.fin.*;


public class Main {

	public static void main(String[] args) throws IOException {
	StudentRegistry Stud = new StudentRegistry();
	int lengthStudents = 0;
	int lengthCourses = 0;
	Course[] allCourses = new Course[100];
	for(int i = 0; i < 100; i++)
		allCourses[i] = new Course();
	
		Path fileName = Path.of("resources/student-register.txt");
	    List<String> fileContent = Files.readAllLines(fileName);

	    for (String line : fileContent) {
	        String[] lineWords = line.split(" ");
	        String firstName = lineWords[0];
	        String lastName = lineWords[1];
	        Stud.Students[lengthStudents].firstName = firstName;
	        Stud.Students[lengthStudents].lastName = lastName; 
	        lengthStudents++;
	    }	
	    Stud.printStudents(lengthStudents);
		
		Path fileNameForCourses = Path.of("resources/courses.txt");
	    List<String> fileContentCours = Files.readAllLines(fileNameForCourses);
	    for (String line : fileContentCours) {
	        String[] lineWords = line.split(" ");
	        allCourses[lengthCourses].name = lineWords[0];
	        allCourses[lengthCourses].creditsNumber = Integer.parseInt(lineWords[1]);
	        int count = 0;
	        for(int i = 2; i < lineWords.length; i++)
	        {
	        	allCourses[lengthCourses].roomNumbers[count] = Integer.parseInt(lineWords[i]); 
	        	count++;
	        }
	        lengthCourses++;
	    }
	    
	    for(int i = 0; i < lengthCourses; i++)
		{
			System.out.print(allCourses[i].name + " " + allCourses[i].creditsNumber + " ");
			for(int j = 0; j < allCourses[i].roomNumbers.length && allCourses[i].roomNumbers[j] != 0; j++)
				System.out.print(allCourses[i].roomNumbers[j] + " ");
			System.out.println();
		}
	    Stud.addStudent("Alex","Radu",lengthStudents);
	    lengthStudents++;
	    Stud.printStudents(lengthStudents);
	        
		
	}

}
