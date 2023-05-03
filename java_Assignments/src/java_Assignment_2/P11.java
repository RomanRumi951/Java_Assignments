package java_Assignment_2;

class Person3 {
    String name, bDate, gender;

    public Person3() {
        System.out.println("Student's Name :: " + (name = "Vipul"));
        System.out.println("Student's Birth Date :: " + (bDate = "1-08-2007"));
        System.out.println("Student's Gender :: " + (gender = "Male"));
    }
}

class StudentDetails3 extends Person3 {
    String course, college, university;

    public StudentDetails3() {
        System.out.println("Running Course :: " + (course = "BCA"));
        System.out.println("College :: " + (college = "H.J.D.ITI"));
        System.out.println("University :: " + (university = "Saurashtra University"));
    }
}

class Marks3 extends StudentDetails3 {
    char grade;
    int M1, M2, M3, M4;

    float avg;

    public Marks3() {
        System.out.println("C Language Marks :: " + (M1 = 80));
        System.out.println("CF Marks :: " + (M2 = 80));
        System.out.println("CS Marks :: " + (M3 = 80));
        System.out.println("HTML Marks :: " + (M4 = 80));
        System.out.println("Average :: " + (avg = (M1 + M2 + M3 + M4) / 4));
        System.out.println("GRADE :: " + (grade = 'A'));
    }
}

public class P11 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Marks3();
    }

}
