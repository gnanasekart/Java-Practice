package J8_Method_Reference;

interface B{
	public boolean checkDigit(int x);
}

public class Static_Method2 {
	
	public static boolean isDigit(int x) {
		return x > -10 && x < 10;
	}
	
	public static void main(String[] args) {
		
		B a = (x) -> { return x > -10 && x < 10; };
		System.out.println(a.checkDigit(5));
		
		B a1 = Static_Method2::isDigit;
		System.out.println(a1.checkDigit(20));
	}

}
