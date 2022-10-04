package PatternProgram;

import org.testng.annotations.Test;

public class AlphaPramid {

	@Test
	public void example1() {
		//A to F in left pramid
		int x = 6;
		leftPramid(x);
		AlfaPramid(x);
	}

	private void leftPramid(int x) {
		char a = 65;
		for(int i=0; i<x; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)(a+j)+" ");	
			}
			System.out.println();
		}	
	}
	
	private void AlfaPramid(int x) {
		char a = 65;
		for(int i=0; i<x; i++, a++) {
			for(int j=0; j<=i; j++) {
				System.out.print(a +" ");
			}
			System.out.println();
		}	
	}
}