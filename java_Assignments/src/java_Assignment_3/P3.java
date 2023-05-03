package java_Assignment_3;

import java.util.Random;
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random R = new Random();
		System.out.println("Enter Any Number To Generate Random Number !!! ");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (int i = 1; i <= a; i++) {
			System.out.println(i +" : " + R.nextInt());
		}	
		scan.close();
	}
}
