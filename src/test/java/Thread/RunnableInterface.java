package Thread;

public class RunnableInterface implements Runnable {

	String name;
	public RunnableInterface(String name) {
		this.name = name;
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name +" " +i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		RunnableInterface rI = new RunnableInterface("one");

		RunnableInterface rI2 = new RunnableInterface("two");
	}
}
