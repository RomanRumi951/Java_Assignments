package java_Assignment_3;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Any Five Values With Their keys :: ");
		Scanner scan = new Scanner(System.in);
		Hashtable<String,String> ht = new Hashtable<String, String>();
		for (int i = 0; i < 5; i++) {
			ht.put(scan.nextLine(), scan.nextLine());
//			ht.put("A", 1);
		}
		Enumeration<String> e = ht.keys();
		while (e.hasMoreElements()) {
			String k = e.nextElement();
			String v = ht.get(k);
//			ht.get(e);
			System.out.println(k + " " + v);
		}
		scan.close();
	}

}
