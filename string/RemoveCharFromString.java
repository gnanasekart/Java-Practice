package string;

import org.testng.annotations.Test;

public class RemoveCharFromString {
	//@Test
	public void example1() {
		String s1 = "test";
		char ch = 't';
		removeChar(s1, ch);
	}
	
	@Test
	public void example2() {
		String s1 = "aaaa";
		char ch = 'a';
		removeChar(s1, ch);
	}

	private void removeChar(String s1, char ch) {
		int right=0;
		char[] charr = new char[s1.length()];
		while(right<s1.length()) {
			if((s1.charAt(right))!=ch) {
				charr[right]=s1.charAt(right);
			}
			right++;
		}
		System.out.println(String.copyValueOf(charr));
	}
}
