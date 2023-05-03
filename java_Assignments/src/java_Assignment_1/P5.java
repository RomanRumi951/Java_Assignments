// JAVA PROGRAM TO ACCEPT ROW, COLUMN & STRING USING COMMAND LINE ARGUMENT, PRINT ACCEPTED STRING AT SPECIFIED ROW, COLUMN LOCATION ON CONSOLE SCREEN...
package java_Assignment_1;

class P5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        for (int i = 1; i < a; i++) {
            System.out.println();
        }
        for (int j = 1; j < b; j++) {
            System.out.print(" ");
        }
        System.out.print(args[2]);
    }
}