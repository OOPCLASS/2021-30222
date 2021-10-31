package Lab4.model.jos.fin;

public class Course {
public String name;
public int creditsNumber;
public int[] roomNumbers = new int[10]; 
public Course()
{
name = "Null";
creditsNumber = 0;
for(int i = 0; i < 10; i++)
roomNumbers[i] = 0;
}
}
