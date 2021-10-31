package ro.utcluj.model;

import java.util.ArrayList;

public class Course {

    public String name;
    public String creditsNumber;
    ArrayList<Integer> roomNumbers = new ArrayList<Integer>();

    public Course(String name, String creditsNumber, ArrayList<Integer> roomNumbers) {
        this.name = name;
        this.creditsNumber = creditsNumber;
        this.roomNumbers = roomNumbers;
    }

    public String getFullCourse() {
        return this.name + " " + this.creditsNumber;
    }
    public String getFullRoomNumbers() {
        return this.roomNumbers.get(0) + " " + this.roomNumbers.get(1);
    }
}

