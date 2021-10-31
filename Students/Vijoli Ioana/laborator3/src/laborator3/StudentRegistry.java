package laborator3;

public class StudentRegistry {

        public Student[] students;
        public int numberOfStudents;
        public int sizeOfRegistry;

        public StudentRegistry(int sizeOfRegistry) {

            students = new Student[sizeOfRegistry];
            numberOfStudents = 0;
            this.sizeOfRegistry = sizeOfRegistry;
        }

        public void addStudent(Student student) {
            if(sizeOfRegistry > numberOfStudents) {
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
