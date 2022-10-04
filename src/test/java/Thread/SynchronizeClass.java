package Thread;

public class SynchronizeClass {

	//private volatile int count = 0;
	private int count = 0;
	//while using synchronized we don't need to use volatile, 
	//because here only one thread going to update the cache memory.
	
	public static void main(String[] args) {
		SynchronizeClass syn = new SynchronizeClass();
		syn.doWork();
	}

	/*synchronized will allow to access only one thread at a time
	
	//synchronize will be applicable for method level 
	public synchronized void increment() {
		count++;
	}
	//synchronize will be applicable for particular object level
	 * 
*/
	public void increment() {
		synchronized (this) {
			count++;
		}
	}
	public void doWork() {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}				
			}
		});
		thread.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});
		thread2.start();

		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("count is = "+count);
	}
}
