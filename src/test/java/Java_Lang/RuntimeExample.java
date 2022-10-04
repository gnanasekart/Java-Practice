package Java_Lang;

public class RuntimeExample {

	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
		runtime.addShutdownHook(new Thread() {
		public void run() {
			System.out.println("going to shutdown");
		}
		});
		
		//it will return the no of process inside the system
		System.out.println(runtime.availableProcessors());

		// From Java 1.5v they bring ProcessBuilder instead of Runtime
		try {
			//Execute the notepad 
			//Process process = runtime.exec("Notepad");
			//wait in background until the process/exec file close
			//process.waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		//Once the last line of main method is executed then the JVM process will shutdown it won't consider anything
		// while shutting down if we need to show any message means we need to call addShutdownHook method
		
		//-----------------------------------------------------------------------
		
		//System
		
		int[] one = {11, 22, 33, 44, 55, 66};
		int[] two = new int[one.length];
			
		//fastest way of coping array from one array to another array.
		System.arraycopy(one, 0, two, 0, one.length);
		
	}

}