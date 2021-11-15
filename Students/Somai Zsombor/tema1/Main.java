package lab3;

import java.io.IOException;

import lab3.Student;
import lab3.StudentRegistry;

public class Main {

    public static void main(String[] args) throws IOException {
        StudentRegistry listOfStudents = new StudentRegistry("/Users/somaizsombor/IdeaProjects/poo/asd/src/lab3/file.txt");
        CourseRegistry listOfCourses = new CourseRegistry("/Users/somaizsombor/IdeaProjects/poo/asd/src/lab3/course.txt");
        listOfStudents.print();
        listOfCourses.getCourses();
        listOfStudents.addStudent(new Student());
        listOfStudents.print();
    }

}
