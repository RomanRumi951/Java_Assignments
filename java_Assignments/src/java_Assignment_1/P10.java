// JAVA PROGRAM THAT DEFINES RECTANGULAR ARRAY OF INTEGERS..
package java_Assignment_1;

import java.util.Scanner;

class P10 {
    public static void main(String[] args) {
        System.out.println("Enter Two Numbers For The Size Of The Row And Column :: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int input1 = scan.nextInt();
        System.out.println("Enter Any " + (input * input1) + " Numbers :: ");
        int arr[][] = new int[input][input1];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input1; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        System.out.println("Output Of Inputed " + (input * input1) + " Numbers :: ");
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}