package java_Assignment_3;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 0, c;
		try {
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			try {
				System.out.println(args[0]);
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
		} finally {
			System.out.println("Arithmetic Error Game Over!!");
			System.out.println("Array Error Game Over !");
		}
	}

}
