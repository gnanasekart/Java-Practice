package Thread;

public class VolatileKeyword extends Thread {
	 boolean keepRunning = true;

	public void run() {
		long count=0;
		while(keepRunning) {
			count++;
		}
		System.out.println("Thread terminated - "+count);
	}

	public static void main(String[] args) throws InterruptedException {
		VolatileKeyword vk = new VolatileKeyword();
		vk.start();
		Thread.sleep(1000);
		vk.keepRunning = false;
		System.out.println("keep running is false");
	}
}