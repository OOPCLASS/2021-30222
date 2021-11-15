package lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import lab3.Student;



public class StudentRegistry {
    private LinkedList<Student>listOfStudents = new LinkedList<>();


    public StudentRegistry(String nameOfFile) throws IOException{
        Path fileName = Paths.get(nameOfFile);
        List<String> fileContent = Files.readAllLines(fileName);
        for(String line: fileContent){
            String[] words = line.split(" ");
            listOfStudents.push(new Student(words[0], words[1], words[2]));
        }
    }

    public void addStudent(Student newStudent){
        this.listOfStudents.push(newStudent);
    }

    public void print(){
        for(Student student: listOfStudents){
            student.sayName();
        }
    }

}
