package string;

import org.testng.annotations.Test;

public class vovel {

	@Test
	public void vovelExample() {
		System.out.println(returnvovel1("gnanasekar"));
	}
	
	private boolean returnVovel(String text) {
		return text.toLowerCase().matches(".*[aeiou]*.");
	}
	
	private boolean returnvovel1(String text) {
		char[] ch = text.toCharArray();
		for(int i=0; i<ch.length-1; i++) {
			if(ch[i]=='a' || ch[i] =='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
				return true;
		}
		return false;
	}
}
