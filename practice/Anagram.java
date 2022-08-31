package practice;

import java.util.HashMap;

import org.testng.annotations.Test;

public class Anagram {

	@Test
	public void example1() {
		String input1 = "post";
		String input2 = "stop";
		
		anagram(input1, input2);
	}

	private void anagram(String input1, String input2) {		
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		
		for(int i=0; i<input1.length(); i++) {
			map1.put(input1.charAt(i), 1);
		}
		
		for(int i=0; i<input2.length(); i++) {
			map2.put(input2.charAt(i), 1);
		}
		
			if(map1.equals(map2)) System.out.println("correct");
			else System.out.println("wrong");
		}
	
	}