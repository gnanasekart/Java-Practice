package practice;

import org.testng.annotations.Test;

public class Palindrome {

	@Test
	public void example1() {
		long num = 121;
		palindromeNumber(num);
	}

	@Test
	public void example2() {
		String s = "aba";
		palindromeString(s);
	}

	private void palindromeNumber(long num) {
		long r, sum=0, temp=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			sum=(sum*10)+r;
		}
		if(sum == temp) System.out.println("Correct");
		else System.out.println("Wrong");
	}

	private void palindromeString(String s) {
		String ss="";
		int i=s.length()-1;
		while(i>=0) ss+=s.charAt(i--);
		if(s.equals(ss)) System.out.println("Correct");
		else System.out.println("Wrong");
	}
}