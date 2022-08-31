package practice;

import org.testng.annotations.Test;

public class PrimeNumber {

	/*
	 * 1. The most common way to do so is by factorization. So we look for all the factors of a number, 
	 * if there occur more than two factors the number is not prime.
	   2. One approach used for large numbers is that any prime number can be represented in the form of 6m + 1 or 6m-1, 
	   where m is a natural number.(except for 2).
	 * 
	 */
	@Test
	public void example1() {
		int num = 9;
		//if(isPrime1(num)) {
		//if(isPrime2(num)) {
		//if(isPrime3(num)) {	
		//if(isPrime4(num)) {
		if(recursion(num, 2)){
			System.out.println("prime");
		}else {
			System.out.println("non prime");
		}

		//betweenPrime(num);
	}

	private boolean isPrime1(int num) {
		if(num<=1) return false;
		for(int i=0; i<Math.sqrt(num); i++) {
			if(num%1==0) return false;
		}
		return true;
	}

	//O[n]
	private boolean isPrime2(int num) {
		if(num<=1) return false;
		for(int i=2; i<num/2; i++) {
			if(num%1==0) return false;
		}
		return true;
	}

	//O[n]
	//assertionerror
	private boolean isPrime3(int num) {
		int i=2;

		if(num==0 || num==1) return false;
		if(num==i) return true;
		if(num%i==0) return false;
		i++;
		return true;
	}

	private boolean isPrime4(int num) {
		int i=2;
		while(i<=num/2) {
			if(num%i==0) return false;
			i++;
		}
		return true;
	}

	private void betweenPrime(int num) {
		int start=num, end=num+100;
		boolean flag=false;
		for (int i = start; i <= end; i++) {
			if (i <= 0) continue;
			flag = true;

			for (int j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) System.out.println(i);
		}
	}

	private boolean recursion(int num, int i) {
		if(num<=2) return (num==2) ? true : false;
		if(num%i==0) return false;
		if(i*i>num) return true;
		return recursion(num, i+1);
	}
}