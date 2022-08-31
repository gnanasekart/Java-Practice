package practice;

import org.testng.annotations.Test;

import practice.baseTestNG;

public class ArmstrongNumber extends baseTestNG {

	@Test
	public void example1() {
		int n = 154;
		armstrongNumber(n);
	}
	
	@Test
	public void example2() {
		int n = 153;
		armstrongNumber(n);
	}
	
	@Test
	public void example3() {
		int n = 1221;
		armstrongNumber(n);
	}
	
	@Test
	public void example4() {
		int n = 001;
		armstrongNumber(n);
	}

	private void armstrongNumber(int n) {
		int sum= 0;
		int remainder, q;
		int original = n;
		while(n>0) {
			remainder = n%10;
			n = n/10;
			sum+=(remainder*remainder*remainder);
		}
		if(sum == original) System.out.println("correct");
		else System.out.println("wrong");
	}
}