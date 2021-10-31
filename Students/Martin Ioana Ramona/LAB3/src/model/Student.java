package model;

import java.util.Random;

public class Student {
    public String uniqueIdentificationNumber;
    public String firstName;
    public String lastName;
    public Course[] courses;

    public Student(String firstName, String lastName) {
        uniqueIdentificationNumber = String.valueOf(getRandom(9999));
        this.lastName = lastName;
        this.firstName = firstName;
        courses = new Course[getRandom(7)];

    }

    private int getRandom(int maxNumber) {
        // TODO Auto-generated method stub
        Random rand = new Random();
        return rand.nextInt(maxNumber);
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
