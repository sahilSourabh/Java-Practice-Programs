package javaPractice.Concepts;

class Counter {
	
	int count;
	//The synchronized keyword is a modifier that locks a method so that only one thread can use it at a time.
	public synchronized void increment() {
		
		count++;
	}
}

public class Sychronization {

	public static void main(String[] args) throws InterruptedException {
		
		Counter counter = new Counter();
		
		Thread t1 = new Thread(new Runnable() {
			
			public void run() {

				for (int i = 0; i < 1000; i++) {
					counter.increment();
				}
			}

		});
		
		Thread t2 = new Thread(new Runnable() {
			
			public void run() {

				for (int i = 0; i < 1000; i++) {
					counter.increment();
				}
			}

		});
		
		t1.start();
		t2.start();
		
		//join() is a method that allows main thread to wait for the other threads to come back and join.
		t1.join();
		t2.join();
		
		System.out.println("Counter Value : "+ counter.count);
		

	}

}
