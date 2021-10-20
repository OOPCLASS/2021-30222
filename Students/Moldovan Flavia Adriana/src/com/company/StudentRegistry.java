package com.company;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegistry {

    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Flavia", "Moldovan", 3));
        students.add(new Student("Alexandru", "Moldovan", 5));
        students.add(new Student("Alina", "Placintar", 1));
        students.add(new Student("Vlad", "Stroia", 2));
        students.add(new Student("Elisabeta", "Manea", 2));
        students.add(new Student("Stefan", "Tamas", 3));
        students.add(new Student("Maria", "Bogdan", 4));
        students.add(new Student("Denisa", "Becus", 1));
        students.add(new Student("Andrei", "Podar", 3));
        students.add(new Student("Larisa", "Rus", 4));

        File file1 = new File("students.txt");
        Scanner scan1 = new Scanner(file1);
        System.out.println(scan1.nextLine());

        File file2 = new File ("courses.txt");
        Scanner scan2 = new Scanner (file2);
        System.out.println(scan2.nextLine());

        addStudent (students, new Student("Roxana", "Madac", 1));
        printListOfStudents(students);
    }

    public static void addStudent (ArrayList<Student> students, Student student){
        students.add(student);
    }

    public static void printListOfStudents (ArrayList<Student> students){
        for(Student s : students) {
            System.out.println(s);
        }
    }
}
