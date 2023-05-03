package java_Assignment_3;

import java.text.SimpleDateFormat;
import java.util.Date;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat SDF = new SimpleDateFormat("MM-dd-yyyy");
		Date currentDate = new Date();
		System.out.println("Today :: " + SDF.format(currentDate));
		System.out.println(currentDate.toInstant());
		
//		System.out.println(SDF.getCalendar());
//		System.out.println(currentDate.before(currentDate));
	}

}
