package string;

import org.testng.annotations.Test;

public class countWords {
	@Test
	public void example1() {
		String s1 = "Hi How are you...";
		countWordsFromString(s1);
		String s2 = "are";
		String s3 = "yo";
		containWord(s1, s3);
	}

	private void countWordsFromString(String s1) {
		String[] str =  s1.split(" ");
		System.out.println(str.length);
	}
	
	private void containWord(String s1, String s2) {
		//using contains method
		System.out.println(s1.contains(s2));
	
		//using match method
		System.out.println(s1.matches("(.*)"+s2+"(.*)"));
		
		//using indexOf
		System.out.println(s1.indexOf(s2)!=-1);
	}
}