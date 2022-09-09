package RegexPattern;

import org.testng.annotations.Test;

public class Stringsplit {
	
	@Test
	public void example1() {
		String s="He is a very very good boy, isn't he?";
		String[] str = s.trim().split("[A-Za-z !,?._'@]+");
		if(str.length==0) System.out.println(0);
		else {
			for(String ss : str){
				System.out.println(ss);
			}

		}
	}

}
