package java_Assignment_3;



public class P12 extends Thread {
	public synchronized void iterate() {
		int i;
		for(i = 0; i <= 50; i++) {
			System.out.println(i);
//			i = i + 1;
		}
//		System.out.println(i);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		iterate();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t2 = new Thread(new Runnable() {
			P12 obj2 = new P12();
			@Override
			public void run() {
				// TODO Auto-generated method stub
				obj2.iterate();
			}
		});
		P12 obj = new P12();
//		P12 obj1 = new P12();
		obj.start();	
		obj.join();
		t2.start();
//		obj.join();
	}

}
