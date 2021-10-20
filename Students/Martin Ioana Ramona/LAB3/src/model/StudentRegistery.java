package model;

public class StudentRegistery {

    public Student[] students;
    public int registeryCapacity;
    public int numberOfStudents;

    public StudentRegistery(int registeryCapacity) {

        students = new Student[registeryCapacity];
        this.registeryCapacity = registeryCapacity;
        numberOfStudents = 0;
    }

    public void addNewStudent(Student student) {
        if (registeryCapacity == numberOfStudents) {
            System.out.println("The student registery is full");
        } else {
            students[numberOfStudents] = student;
            numberOfStudents++;
        }
    }

    public void printStudents() {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(students[i].getFullName() + " ");
        }
    }

}
