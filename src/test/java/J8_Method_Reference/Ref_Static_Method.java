package J8_Method_Reference;

interface Sayable{
	void say();
}

public class Ref_Static_Method {
	
	public static void saySomething() {
		System.out.println("something");
	}
	
	public static void main(String[] args) {
		//refering static method
		Sayable sayable = Ref_Static_Method::saySomething;
	
		//calling interface method
		sayable.say();
	
		//predefined functional interface Runnable to refer static method.
		Thread t = new Thread(Ref_Static_Method::saySomething);
		t.run();
	}
}
