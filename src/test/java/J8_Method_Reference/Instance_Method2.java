package J8_Method_Reference;

interface Bb {
    void add(int x, int y);
}

class Addition {
	public void sum(int a, int b) {
	    System.out.println("The sum is :"+(a+b));
	}
}

public class Instance_Method2 {

	public static void main(String[] args) {
		Bb b = (x, y) -> System.out.println("sum = "+(x+y));
		b.add(10, 20);
		
		//sum is an instance method so we calling using class object ref
		Bb b1 = new Addition()::sum;
		b1.add(11, 22);
		
	}
}
