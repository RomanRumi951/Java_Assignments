package java_Assignment_2;

class Person1 {
    String name, bdate, gender;

    public Person1() {
        System.out.println("Default Constructor Called!! ");
    }

    public Person1(String name, String bdate, String gender) {
        System.out.println("Student's Name :: " + (this.name = name));
        System.out.println("Student's Birth Date :: " + (this.bdate = bdate));
        System.out.println("Student's Gender :: " + (this.gender = gender));
    }
}

public class P9 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Person1();
        new Person1("Roman", "21-08-2003", "Male");
    }
}