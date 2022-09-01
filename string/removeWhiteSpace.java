package string;

import org.testng.annotations.Test;

public class removeWhiteSpace {

	@Test
	public void example1() {
		String str = "This is new  string";
		removeSpace(str);
	}

	private void removeSpace(String str) {
		StringBuilder strb = new StringBuilder();
		String sconcat="";
		for(char c: str.toCharArray()) {
			if(!Character.isWhitespace(c)) {
				//strb.append(c);
				sconcat+=c;
			}
		}
		//System.out.println(strb.toString());
		System.out.println(sconcat.toString());
	}
}