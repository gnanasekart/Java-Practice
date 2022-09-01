package practice;

import org.testng.annotations.Test;

public class FibonacciSeries{

	@Test
	public void example1() {
		int total = 10;
		Fibonacci(total);
	}

	@Test
	public void example2() {
		int total = 10;
		Fibonacci2(total);
	}

	@Test
	public void example3() {
		int total = 10, n=1;
		while(n<total) {
			System.out.print(Fibonaccifunc(n)+" ");
			n++;
		}

	}

	private void Fibonacci(int total) {
		int n1=0, n2=1, n3;
		for(int i=2; i<=total; i++) {
			n3 = n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		System.out.println();
	}

	private void Fibonacci1(int total) {
		int n=1, t1=0, t2=1;
		while(n<=total) {
			int sum=t1+t2;
			System.out.print(sum+" ");
			t1=t2;
			t2=sum;
			n++;
		}
		System.out.println();
	}

	private void Fibonacci2(int total) {

		int[] arr = new int[total];
		int n=2;
		arr[0]=0;
		arr[1]=1;
		while(n<total) {
			arr[n]=arr[n-1]+arr[n-2];
			System.out.print(arr[n-1]+" ");
			n++;
		}
		System.out.println();
	}

	private int Fibonaccifunc(int n) {
		if(n<=1) return n;
		
		return Fibonaccifunc(n-1)+Fibonaccifunc(n-2);
	}
}