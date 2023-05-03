package java_Assignment_2;

class Example {
    int a;
    String name;

    public Example(int a, String name) {
        this.a = a;
        this.name = name;
    }
}

class Example1 extends Example {
    public Example1() {
        super(1, "Yohan");
        System.out.println("Student's Roll No Is :: " + a);
        System.out.println("Student's Name Is :: " + name);
    }
}

public class P5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Example1();
    }

}
