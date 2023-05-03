package java_Assignment_3;

import java.util.Scanner;

public class P10 extends Thread {

	public P10() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Press 1 To Start Download : ");
		int a = scan.nextInt();
		if (a == 1) {
			System.out.println("Download Started");
			start();
		} else {
			System.out.println("Could Not Start Download!!");
		}
		scan.close();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 1; i < 17; i++) {
				System.out.print(".");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("\nDownload Complete.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P10();
		}
}
