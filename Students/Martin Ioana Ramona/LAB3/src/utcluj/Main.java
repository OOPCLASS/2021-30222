package utcluj;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import model.Course;
import model.Student;
import model.StudentRegistery;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        StudentRegistery studentRegistery = new StudentRegistery(10);

        Path fileName = Path.of("src/students.txt");
        List<String> fileContent = Files.readAllLines(fileName);

        for (String line : fileContent) {
            String[] lineWords = line.split(" ");
            String firstName = lineWords[0];
            String lastName = lineWords[1];
            studentRegistery.addNewStudent(new Student(firstName, lastName));
        }
        studentRegistery.printStudents();

        Path fileName2 = Path.of("src/courses.txt");
        List<String> fileContent2 = Files.readAllLines(fileName2);

        Course[] courses = new Course[10];
        int numberOfCourses = 0;

        for (String line : fileContent2) {
            String[] lineWords = line.split(" ");
            String courseName = lineWords[0];
            int creditsNumber = Integer.parseInt(lineWords[1]);
            int[] roomNumbers = new int[lineWords.length - 2];
            for (int i = 2; i < lineWords.length; i++) {
                roomNumbers[i - 2] = Integer.parseInt(lineWords[i]);
            }
            courses[numberOfCourses] = new Course(courseName, creditsNumber, roomNumbers);
            numberOfCourses++;
        }

        for (int i = 0; i < numberOfCourses; i++) {
            courses[i].getCourse();
            System.out.println();
        }

    }
}
