package practice;

import org.testng.annotations.Test;
public class Swap
{
	@Test
	public void example()
	{
		//Instant start = Instant.now();
		int a=10, b=20;
		//swapNormal(a, b);
		//swapWithoutTemp(a, b);
		XorOperator(a, b);
	}

	private void swapNormal(int a, int b) {
		int t = a;
		a = b;
		b = t;
		System.out.println(a+" "+b);
	}

	private void swapWithoutTemp(int a, int b) {
		a = a+b; //30
		b = a-b; //10
		a = a-b; //20

		System.out.println(a+" "+b);
	}
	
	private void XorOperator(int a, int b) {
		a = a^b;
		b = a^b;
		a = a^b;
		
		System.out.println(a+" "+b);
	}
}
