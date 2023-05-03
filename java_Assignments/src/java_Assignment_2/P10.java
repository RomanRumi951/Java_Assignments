package java_Assignment_2;

class Person2 {
    int id;
    String name;

    public void Display(int id, String name) {
        System.out.println("Student's ID is :: " + (this.id = id));
        System.out.println("Student's NAME is :: " + (this.name = name));
    }
}

class StudentDetails2 extends Person2 {
    String course;

    @Override
    public void Display(int sem, String course) {
        System.out.println("Student's Sem is :: " + sem);
        System.out.println("Student's Course is :: " + (this.course = course));
    }
}


public class P10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Person2 P2 = new Person2();
        P2.Display(1, "Johan");
        StudentDetails2 SD = new StudentDetails2();
        SD.Display(2, "MCA");


    }

}
