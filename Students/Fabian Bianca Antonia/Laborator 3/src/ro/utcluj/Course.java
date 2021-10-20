package ro.utcluj;

public class Course 
{
	String courseName;
	int creditsNumber;
	int[] roomNumbers;	
	public Course(String courseName, int creditsNumber, int[] roomNumbers)
	{
		this.courseName= courseName;
		this.creditsNumber= creditsNumber;
		this.roomNumbers= roomNumbers;
	}
	public String getCourse()
	{
		String course = courseName +" "+ creditsNumber + " ";
		for(int i=0;i<roomNumbers.length;i++)
		{
			course=course+roomNumbers[i]+ " ";
		}
		return course;
	}
}

