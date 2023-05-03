package java_Assignment_3;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Any Five Values :: ");
		Vector<String> v = new Vector<String>();// This Vector Will Accept Only Integer Type Values..
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			v.addElement(scan.nextLine());
		}
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}
		scan.close();
	}

}
