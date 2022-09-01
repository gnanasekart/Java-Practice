package string;

import org.testng.annotations.Test;

public class countWords {
	@Test
	public void example1() {
		String s1 = "Hi How are you...";
		countWordsFromString(s1);
	}

	private void countWordsFromString(String s1) {
		String[] str =  s1.split(" ");
		System.out.println(str.length);
	}
}
