package java_Assignment_3;

import java.util.Scanner;

public class P11 implements Runnable {

	Thread th;
	
	public P11() {
		th = new Thread(this);
		Scanner scan = new Scanner(System.in);
		System.out.print("Press 1 To Start Upload : ");
		int a = scan.nextInt();
		if (a == 1) {
			System.out.println("Upload Started");
			th.start();
		} else {
			System.out.println("Could Not Start Upload!!");
		}
		scan.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P11();
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
			System.out.println("\nUpload Complete.");
		}
	}

}
