package java_Assignment_2;

public class P3 {
    //This is Demonstrating VAR...ARGS Example!!
    public static void myMethod(String... str) {
        for (String val : str) {
            System.out.print(val);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        P3.myMethod("My", " Name", " Is", " Roman", " Rumi");
    }

}
