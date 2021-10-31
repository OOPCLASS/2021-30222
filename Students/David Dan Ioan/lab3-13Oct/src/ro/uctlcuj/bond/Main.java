package ro.uctlcuj.bond;

import java.nio.file.Files;
import java.util.Random;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;

public class Main {
	private static int numberOfRandomStudentsToBeGenerated=10;/// this is stupid :( I miss #define
	public static void main(String[] args) throws IOException {
		
		
		Random rand=new Random();
		Student randomStudent;		
		StudentRegistry legitReg=new StudentRegistry();
		StudentRegistry fakeReg=new StudentRegistry();
		Course readCourse;
		Student knownStudent=new Student("Alin", "Ciorbea", "RO123456");
		legitReg.addStudent(knownStudent);		
		legitReg.PrintStudents();
		
		
		for(int i=0; i<numberOfRandomStudentsToBeGenerated; i++) {
			randomStudent=new Student();
			fakeReg.addStudent(randomStudent);
		}
		fakeReg.PrintStudents();
			
		
		Path fileName = Path.of("Students.txt");
		List<String> fileContent = Files.readAllLines(fileName);
		for (String line : fileContent) {
		      String[] lineWords = line.split(" ");
		      String firstName = lineWords[0];
		      String lastName = lineWords[1];
		      String uid = lineWords[2];
		      knownStudent=new Student(firstName, lastName, uid);		    
		      legitReg.addStudent(knownStudent);
		}
		legitReg.PrintStudents();
		
		Path fileName2 = Path.of("Courses.txt");
		List<String> fileContent2 = Files.readAllLines(fileName2);
		for (String line : fileContent2) {
		      String[] lineWords = line.split(" ");
		      String name = lineWords[0];
		      
		      int rooms[] = new int[10];
		      int creditsNr = Integer.parseInt(lineWords[1]);
		      for(int room=0; room<lineWords.length-2; room++ )
		    	  rooms[room]=Integer.parseInt(lineWords[room+2]);	
		      readCourse=new Course(name, creditsNr, rooms);
		      for(int i=0; i<rand.nextInt(fakeReg.numberOfStuds); i++)// A random number of students join the course we just read
		    	  fakeReg.studs[rand.nextInt(fakeReg.numberOfStuds)].joinCourse(readCourse);
		}
		fakeReg.PrintStudents();
		
	}
}


