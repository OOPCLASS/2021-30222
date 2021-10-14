package com.company;

public class Student {
    private String firstName;
    private String lastName;
    private int nrOfCourses;

    public Student (String firstName, String lastName, int nrOfCourses){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setNrOfCourses(nrOfCourses);
    }

    @Override
    public String toString() {
        return firstName + '\'' +
                lastName + '\'' +
              + nrOfCourses
                ;
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;
    }

    public String getFirstName (String firstName){
        return firstName;
    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getLastName (String lastName){
        return lastName;
    }

    public void setNrOfCourses (int nrOfCourses){
        this.nrOfCourses = nrOfCourses;
    }

    public int getNrOfCourses (int nrOfCourses){
        return nrOfCourses;
    }
}

