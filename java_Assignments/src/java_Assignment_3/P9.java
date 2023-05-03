package java_Assignment_3;

public class P9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread th = Thread.currentThread();
		th.setName("This is A Main Thread");
		th.setPriority(8);
//		System.out.println(th.getContextClassLoader());
//		System.out.println(th.getState());
//		System.out.println(Thread.getAllStackTraces());
		System.out.println(th);
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			th.sleep(1000);
		}
	}
}
