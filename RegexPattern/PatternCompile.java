package RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCompile {

	
	public static void main(String[] args) {
		
		String email = "gnana.sekar123@gmail.co.in";
		
		String pattern = "[a-zA-Z0-9.]+@[a-zA-Z]+.[a-z.]{2,}";
		
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(email);
		
		System.out.println(matcher.matches());
	}
}
