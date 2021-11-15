package lab3;

public class Student {
    public String id;
    public String firstName;
    public String lastName;
    public Student contactPerson;


    public Student(String id, String firstName,String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
    }
    public Student() {
            this.id = "111";
            this.firstName = "asd";
            this.lastName = "sad";
    }


    public void sayName(){
        System.out.println(this.firstName + " " + this.lastName);
    }
}
