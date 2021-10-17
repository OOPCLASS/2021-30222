package ro.uctlcuj.bond;

public class StudentRegistry {
	
	public Student[] studs = new Student[100];/// something is fishy here. 
	public int numberOfStuds=0;///What if later I want to add 101 students in one StudentRegister?
	public void PrintStudents() {/// how can I fix this?
		
		if(numberOfStuds==0 )
			System.out.println("Registru gol");
		else
		{
			System.out.println("In acest registru sunt inscris studentii:");
			for(int i=0; i<numberOfStuds; i++)
				studs[i].presentMyself();
			System.out.println();
		}			
	}
	public void addStudent(Student fresher) {
		studs[numberOfStuds]=fresher;
		numberOfStuds++;		
	}
}
