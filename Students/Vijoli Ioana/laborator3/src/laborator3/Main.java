package laborator3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import laborator3.Student;
import laborator3.StudentRegistry;
import laborator3.Course;

/**
 * Create a StudentRegistry which holds an array of Student(s). Initialize the array
 * with at least 10 instances (random values for the attributes). Every student
 * could have one or more Course(s) which he/she attends. For each Course we should
 * store the name, creditsNumber and an array of roomNumbers
 *
 * 1. Try to read student info from a file students.txt
 * 2. Try to read courses info from a file courses.txt
 * 3. Add a method in StudentRegistry which adds a Student to the array inside StudentRegistry
 */
public class Main {

    public static void main(String[] args) throws IOException {
        StudentRegistry registry = new StudentRegistry(10);
        Course[] courses = new Course[10];
        int numberCourses = 0;

        Path fileName = Path.of("src/students.txt");
        List<String> fileContent = Files.readAllLines(fileName);

        for (String line : fileContent) {
            String[] lineWords = line.split(" ");
            String firstName = lineWords[0];
            String lastName = lineWords[1];
            Student studentToAdd = new Student(firstName, lastName);
            registry.addStudent(studentToAdd);
        }
        registry.printStudents();
        Path fileName1 = Path.of("src/courses.txt");
        List<String> fileContent1 = Files.readAllLines(fileName1);
        for (String line : fileContent1) {
            String[] lineWords = line.split(" ");
            String courseName = lineWords[0];
            int creditsNumber = Integer.parseInt(lineWords[1]);
            int[] roomNumbers = new int[lineWords.length - 2];
            for (int i = 2; i < lineWords.length; i++) {
                roomNumbers[i - 2] = Integer.parseInt(lineWords[i]);
            }
            courses[numberCourses] = new Course(courseName, creditsNumber, roomNumbers);
            numberCourses++;
        }
        for (int i = 0; i < numberCourses; i++) {
            courses[i].getCourse();
            System.out.println();
        }
    }

    }