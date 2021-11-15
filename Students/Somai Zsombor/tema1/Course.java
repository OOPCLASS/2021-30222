package lab3;


import java.util.LinkedList;

public class Course {
    private String name;
    private int numOfCredits;
    private LinkedList<String> listOfClassrooms;
    public Course(String name, int numOfCredits, String[] roomNumbers){
        this.name = name;
        this.numOfCredits = numOfCredits;
        for(String room : roomNumbers){

            if (this.listOfClassrooms != null) {
                this.listOfClassrooms.push(room);
            }
        }
    }

    public void print(){
        System.out.println(this.name + " " + this.numOfCredits);
    }
}
