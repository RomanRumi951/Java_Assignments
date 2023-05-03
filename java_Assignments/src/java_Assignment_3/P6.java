package java_Assignment_3;

import java.util.StringTokenizer;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer ST = new StringTokenizer(" hello; i: study; in: Bhavans's; Shree: H.J.; Doshi; IT: Institute ", ":;");
		while(ST.hasMoreTokens()) {
			System.out.println(ST.nextToken());
		}
	}

}
