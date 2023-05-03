package java_Assignment_3;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter A Number : ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		try {
			if (a < 0) {
				throw new myException();
			}
			else {
				System.out.println(a);
			}
		} catch (myException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		scan.close();
	}
}

class myException extends Exception {

	final static String str = "Cannot Enter Negetive Number : ";

	public myException() {
		System.out.println(str);
	}
}
