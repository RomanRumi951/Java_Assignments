// JAVA CODE THAT PRINT MULTIPLICATION TABLE OF A NUMBER(USE COMMAND LINE ARGUMENT TO ACCEPT NUMBER)..
package java_Assignment_1;

class P2 {
    public static void main(String arr[]) {
        int a = Integer.parseInt(arr[0]);
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}