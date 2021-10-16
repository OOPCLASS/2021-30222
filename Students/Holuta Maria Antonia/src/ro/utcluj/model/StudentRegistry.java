package ro.utcluj.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    Student[] students = new Student[9];
    Course[] courses = new Course[4];

    public StudentRegistry()throws IOException {

        Path fileName = Path.of("D:\\workspace_java\\tema2\\src\\ro\\utcluj\\resources\\student-register.txt");
        List<String> fileContent = Files.readAllLines(fileName);

        int i=0;
        for (String line : fileContent) {
            String[] lineWords = line.split(" ");
            String firstName = lineWords[0];
            String lastName = lineWords[1];
            String uniquelIdentificationNumber = lineWords[2];
            students[i] = new Student(firstName, lastName, uniquelIdentificationNumber);
            i++;
        }

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

        students[0].courses = new Course[]{courses[0], courses[1]};
        students[1].courses = new Course[]{courses[2]};
        students[2].courses = new Course[]{courses[3], courses[1]};
        students[3].courses = new Course[]{courses[0], courses[1]};
        students[4].courses = new Course[]{courses[2], courses[1]};
        students[5].courses = new Course[]{courses[0], courses[1]};
        students[6].courses = new Course[]{courses[2], courses[3]};
        students[7].courses = new Course[]{courses[0], courses[3]};
        students[8].courses = new Course[]{courses[2]};

    }
}
