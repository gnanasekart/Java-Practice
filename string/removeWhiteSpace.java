package string;

import org.testng.annotations.Test;

public class removeWhiteSpace {

	@Test
	public void example1() {
		String str = "This is new  string";
		removeSpace3(str);
	}

	private void removeSpace1(String str) {
		StringBuilder strb = new StringBuilder();
		for(char c: str.toCharArray()) {
			if(!Character.isWhitespace(c)) {
				strb.append(c);
			}
		}
		System.out.println(strb.toString());
	}

	private void removeSpace2(String str) {
		String sconcat="";
		for(char c: str.toCharArray()) {
			if(!Character.isWhitespace(c)) {
				sconcat+=c;
			}
		}
		System.out.println(sconcat.toString());
	}
	
	private void removeSpace3(String str) {
		//System.out.println(str.strip());
	}
}