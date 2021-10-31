package ro.utcluj;

public class StudentRegistry 
{
	private Student[] students;
	private int arraySize;
	private int studentsCount;
	
	public StudentRegistry(int arraySize)
	{
		students = new Student[arraySize];
		this.arraySize=arraySize;
		studentsCount=0;
	}
	
	public void AddStudent(Student student)
	{
		if(studentsCount==arraySize)
		{
			System.out.println("Students array is full");
		}
		else
		{
			students[studentsCount]=student;
			studentsCount++;
		}
	}
	
	public void ViewStudents()
	{
		for(int i=0;i<studentsCount;i++)
		{
			System.out.println(students[i].getName()+" ");
		}
	}
	
	public void ViewStudent(int index)
	{
			System.out.println(students[index].getName()+" ");
	}
	
}
