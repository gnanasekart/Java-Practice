package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Collections;

import org.testng.annotations.Test;

public class StringReverse {

	@Test
	public void example1() {
		String name = "GnanaSekar";

		//System.out.println(reverseStringBuilder1(name));

		//System.out.println(revereseStringBuilder2(name));

		//System.out.println(reverseStack(name));

		//System.out.println( reverseByCollections(name));

		//System.out.println(charArray(name));
		
		//System.out.println(recursionmethod(name));
		
		System.out.println(subString(name));
	}

	//Using StringBuilder/StringBuffer.
	private StringBuilder reverseStringBuilder1(String name) {
		char[] ch = name.toCharArray();

		if(ch==null)
			throw new IllegalArgumentException("No string available");

		StringBuilder builder = new StringBuilder();

		for(int i=ch.length-1; i>=0; i--) {
			builder.append(ch[i]);
		}
		return builder;
	}

	//using char array
	private String charArray(String name) {
		char[] ch = name.toCharArray();
		char[] temp = new char[ch.length];

		//method 1
//		for(int i=0; i<ch.length; i++) {
//			temp[ch.length - i -1]= ch[i];
//		}		
//		return String.copyValueOf(temp);

		//method2
		for(int a=0, b=name.length()-1; a<b; a++, b--) {
			char t = ch[a];
			ch[a] = ch[b];
			ch[b] = t;
		}
		return String.copyValueOf(ch);
	}

	//String builder using reverse method
	private String revereseStringBuilder2(String name) {
		return new StringBuilder(name).reverse().toString();
	}

	//using stack
	private String reverseStack(String name) {

		if(name==null || name.equals(""))
			return name;

		char[] ch = name.toCharArray();

		Stack<Character> stack = new Stack<>();
		for(int i=0; i<=ch.length-1; i++) {
			stack.push(ch[i]);
		}

		/*
		int k=0;
		while(!stack.isEmpty()) {
			ch[k++]=stack.pop();
		}
		return String.copyValueOf(ch);
		 */

		//Srting builder

		StringBuilder builder = new StringBuilder();

		while(!stack.isEmpty()) {
			builder.append(stack.pop());
		}

		return builder.toString();
	}

	//Using Collections reverse method

	public String reverseByCollections(String name) {

		List<Character> list = new ArrayList<Character>();

		for(Character c: name.toCharArray()) {
			list.add(c);
		}

		Collections.reverse(list);

		StringBuilder sb = new StringBuilder(list.size());
		list.forEach(c -> sb.append(c));
		return sb.toString();
	}
	
	
	public String recursionmethod(String name) {
		
		char[] ch = name.toCharArray();
		reverse(ch, 0, name.length()-1);
		
		return String.copyValueOf(ch);
	}
	
	public static void reverse(char[] a, int k, int j) {
		if(k < j) {
			char ch = a[k];
			a[k] = a[j];
			a[j] = ch;
			reverse(a, k+1, j-1);
		}
	}
	
	public String subString(String name) {
		//return name.charAt(name.length() - 1) + subString(name.substring(0, name.length() - 1));
		
		return subString(name.substring(1)) + name.charAt(0);
	
	}
}



