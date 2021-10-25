package ro.utcluj.model;

import java.util.Arrays;

/**
 *
 */
public class Student {

    @Override
    public String toString() {
        return "Student{" +
                "uniqueIdentificationNumber='" + uniqueIdentificationNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public String uniqueIdentificationNumber = ""; // 8 bytes
    public String firstName = "";
    public String lastName = "";
    public int[] grades;
    public Course[] courses;

    public Student() {
        System.out.println("hello");
    }

    public Student(String firstName, String lastName, String uniqueIdentificationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uniqueIdentificationNumber = uniqueIdentificationNumber;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

}