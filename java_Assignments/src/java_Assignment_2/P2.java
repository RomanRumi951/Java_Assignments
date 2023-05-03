package java_Assignment_2;

public class P2 {
    //This is Demonstrating Static Variable!!
    static int increment;

    //This is Demonstrating Static Method!!!
    public static void myMethod() {
        System.out.println("Static Method Called !!");
        for (int i = 1; i <= 5; i++) {
            System.out.println(increment);
            increment++;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        P2.myMethod();
    }

}
