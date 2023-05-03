package java_Assignment_3;

import java.util.Calendar;
import java.util.Locale;


public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current Month Name :: "+ Calendar.getInstance().getDisplayName(2, 2, Locale.US));
		System.out.println("Current Year Name :: "+ Calendar.getInstance().get(Calendar.YEAR));
	}
}
