package lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;


public class CourseRegistry {
    private LinkedList<Course> listOfCourses = new LinkedList<>();
    public CourseRegistry(String nameOfFile) throws IOException {
        Path fileName = Paths.get(nameOfFile);
        List<String> fileContent = Files.readAllLines(fileName);
        for(String line : fileContent){
            String[] words = line.split(" ");
            String name = words[0];
            int numOfCredits = Integer.parseInt(words[1]);
            String[] listOfClassrooms = Arrays.copyOfRange(words, 2, words.length);
            listOfCourses.push(new Course(name, numOfCredits, listOfClassrooms));
        }
    }

    public void getCourses(){
        for(Course course : this.listOfCourses){
            course.print();
        }
    }

}
