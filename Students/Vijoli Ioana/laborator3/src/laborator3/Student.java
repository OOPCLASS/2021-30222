package laborator3;
import java.util.Random;

public class Student {

    public String firstName = "";
    public String lastName = "";
    public String uniqueIdentificationNumber = "";
    public Course[] courses;

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
    private int generateRandomNumber(int max)
    {
        Random nr = new Random();
        return nr.nextInt(max);
    }
    public Student(String firstName, String lastName) {
        uniqueIdentificationNumber = String.valueOf(generateRandomNumber(10000));
        this.lastName = lastName;
        this.firstName = firstName;
        courses = new Course[generateRandomNumber(5)];

    }

}
