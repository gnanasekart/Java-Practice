package Thread;

public class ThreadClass extends Thread {

	String name;
	public ThreadClass(String name) {
		this.name = name;
		setName(name);
		start();
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(name +" " +i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadClass rI = new ThreadClass("one");
		ThreadClass rI2 = new ThreadClass("two");
		try {
			rI.join();
			rI2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}