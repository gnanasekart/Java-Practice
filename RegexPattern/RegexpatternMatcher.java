package RegexPattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegexpatternMatcher {

	//@Test
	public void example1() {
		/*
		 * 3
	([A-Z])(.+)
	[AZ[a-z](a-z)
	batcatpat(nat
		 */
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		int count=0;
		while(testCases>0){
			String pattern = in.nextLine();
			try {
				Pattern pat = Pattern.compile(pattern);
				System.out.println("Valid");
			}catch(Exception e){
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
	
	@Test
	public void example2() {
		/*
		 * 000.12.12.034
			121.234.12.12
			23.45.12.56
			00.12.123.123123.123
			122.23
			Hello.IP
		 */
		
//		Scanner in = new Scanner(System.in);
//		String ip = in.nextLine();
		String s = "000.12.12.034";
		String pattern = "3[0-255{3}.]";
		//String pa = "[0-255].[0-255].[0-255].[0-255]";
		Pattern pat = Pattern.compile(pa);
		Matcher matches = pat.matcher(s);
		System.out.println(matches);
		
	}
	
	@Test
	public void example3(){
		/*
		 * The username consists of  to  characters inclusive. 
		 * If the username consists of less than 8 or greater 30 than characters, then it is an invalid username.
		   The username can only contain alphanumeric characters and underscores (_).
		   
		    input 
		    8
			Julia
			Samantha
			Samantha_21
			1Samantha
			Samantha?10_2A
			JuliaZ007
			Julia@007
			_Julia007
		 */
		
		String regularExpression = "^[a-zA-Z][a-zA-Z_0-9]{7,29}$";
	}