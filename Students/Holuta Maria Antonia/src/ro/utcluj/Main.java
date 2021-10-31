package ro.utcluj;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import ro.utcluj.model.Student;
import ro.utcluj.model.Course;
import ro.utcluj.model.StudentRegistry;


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
        int[] numbers = new int[10];
        Student[] students = new Student[10];
        Student firstStudent = new Student("Alex", "Bondor", "123");
        students[0] = firstStudent;
        System.out.println(firstStudent.firstName);

        Student secondStudent = new Student();
        secondStudent.uniqueIdentificationNumber = "234";
        secondStudent.firstName = "Mircea";
        secondStudent.lastName = "Muntean";

        System.out.println(firstStudent.getFullName());
        System.out.println(secondStudent.getFullName());

        Path fileName = Path.of("D:\\workspace_java\\tema2\\src\\ro\\utcluj\\resources\\student-register.txt");
        List<String> fileContent = Files.readAllLines(fileName);

        int i=1;
        for (String line : fileContent) {
            String[] lineWords = line.split(" ");
            String firstName = lineWords[0];
            String lastName = lineWords[1];
            String uniquelIdentificationNumber = lineWords[2];
            students[i] = new Student(firstName, lastName, uniquelIdentificationNumber);
            i++;
        }

        for(int j=0; j<i; j++) {
            System.out.print(students[j].getFullName() + " ");
            System.out.println(students[j].uniqueIdentificationNumber);
        }

        Course[] courses = new Course[4];

        Path fileNameCourse = Path.of("D:\\workspace_java\\tema2\\src\\ro\\utcluj\\resources\\course-register.txt");
        List<String> fileContentCourse = Files.readAllLines(fileNameCourse);

       int k=0;
       int j=0;
       for (String line : fileContentCourse) {
            String[] lineWords = line.split(" ");
            String name = lineWords[0];
            String creditsNumber = lineWords[1];
            String roomNumber1 = lineWords[2];
            int in1=Integer.parseInt(roomNumber1);
            String roomNumber2 = lineWords[3];
            int in2=Integer.parseInt(roomNumber2);
            ArrayList<Integer> roomNumbers = new ArrayList<Integer>();
            roomNumbers.add(in1);
            roomNumbers.add(in2);

            courses[k] = new Course(name, creditsNumber, roomNumbers);
            k++;
       }

        for(int x=0; x<k; x++) {
            System.out.print(courses[x].getFullCourse() + " ");
            System.out.println(courses[x].getFullRoomNumbers());
        }

        StudentRegistry studentRegistry = new StudentRegistry();

        for(Student student: studentRegistry.getStudents()) {
            System.out.println(student.toString());
            for(Course course: student.courses) {
                System.out.println(course.getFullCourse());
            }
        }

    }
}