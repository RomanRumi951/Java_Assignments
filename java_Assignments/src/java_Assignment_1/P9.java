package java_Assignment_1;

import java.util.Scanner;

// JAVA PROGRAM THAT DEFINES ONE DIMENSIONAL ARRAY OF INTEGERS..
class P9 {
    public static void main(String[] args) {
        System.out.println("Enter A Number For The Size Of The Integer Array :: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println("Enter Any " + input + " Numbers :: ");
        int arr[] = new int[input];
        for (int i = 0; i < input; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Output Of Inputed " + input + " Numbers :: ");
        for (int j = 0; j < input; j++) {
            System.out.print(arr[j] + " ");
        }
        scan.close();
    }
}