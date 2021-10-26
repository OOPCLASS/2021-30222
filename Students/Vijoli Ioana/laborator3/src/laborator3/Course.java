package laborator3;

public class Course {
   public String courseName;
   public int creditsNumber;
   public int[] roomNumbers = new int[10];

    public Course(String courseName, int creditsNumber, int[] roomNumbers) {

        this.courseName = courseName;
        this.creditsNumber = creditsNumber;
        this.roomNumbers = roomNumbers;
    }

    public void getCourse() {
        System.out.print(courseName + " " + creditsNumber + " ");
        for (int i = 0; i < roomNumbers.length; i++) {
            System.out.print(roomNumbers[i] + " ");
        }
    }

}
