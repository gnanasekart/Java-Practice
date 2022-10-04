package string;

import org.testng.annotations.Test;

public class StringReverseWithSpecChar {

	@Test
	public void example1() {
		String s1 = "ab-cd";
		//dc-bc
		reverseString(s1);
	}

	@Test
	public void example2() {
		String s1 = "Test-software=Great-Value!";
		//
		reverseString2(s1);
	}

	private void reverseString(String s1) {

		char[] ch = s1.toCharArray();
		char[] arr = new char[ch.length];
		int j=0;
		for(int i=ch.length-1; j<ch.length; i--) {

			if(Character.isAlphabetic(ch[i])) {
				arr[j++]=ch[i];
			}else if(ch[i] == '!'){
				arr[ch.length-1]=ch[i];
			}else {
				arr[j++]=ch[i];
			}
		}
		System.out.println(String.copyValueOf(arr));
	}

	private void reverseString2(String s1) {
		s1.intern();
		char[] ch = s1.toCharArray();
		int right=ch.length-1, left=0;
		while(left<right) {
			if(!Character.isAlphabetic(ch[left])) {
				left++;
			}else if(!Character.isAlphabetic(ch[right])) {
				right--;
			}else {
				char temp = ch[left];
				ch[left++] = ch[right];
				ch[right--] = temp;
			}
		}
		System.out.println(String.copyValueOf(ch));
	}
}