// JAVA PROGRAM THAT DEFINES JAGGED ARRAY OF INTEGERS(ACCEPT ARRAY SIZE AND VALUE FROM USER)..
package java_Assignment_1;

import java.util.Scanner;

class P11 {
    public static void main(String[] args) {
        System.out.print("Enter A Number For The Size Of The Row :: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println();
        // int input1 = scan.nextInt();
        int arr[][] = new int[input][], col = 1, coutNum = 0;
        for (int i = 0; i < input; i++) {
            System.out.print("Enter A Number For The Columns In The " + col + " Row :: ");
            arr[i] = new int[scan.nextInt()];
            coutNum = (arr[i].length) + coutNum;
            col++;
        }
        System.out.println();
        System.out.print("Enter " + coutNum + " Numbers :: ");
        for (int j = 0; j < arr.length; j++) {
            for (int r = 0; r < arr[j].length; r++) {
                arr[j][r] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.print("The Output Of Entered Numbers :: ");
        System.out.println();
        for (int j = 0; j < arr.length; j++) {
            for (int r = 0; r < arr[j].length; r++) {
                System.out.print(arr[j][r] + " ");
            }
            System.out.println();
        }
        scan.close();

    }
}
