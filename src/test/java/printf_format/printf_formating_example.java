package printf_format;

import java.util.Date;
import java.util.Locale;

public class printf_formating_example {

	public static void main(String[] args) {
		
		/*
		 *  It consists of literals and format specifiers. Format specifiers include flags, width, precision, 
		   and conversion characters in this sequence:

		   %[flags][width][.precision]conversion-character

		   printf() uses the java.util.Formatter class to parse the format string and generate the output.

		   The [flags] define standard ways to modify the output and are most common for formatting integers and 
		   floating-point numbers.

		   The [width] specifies the field width for outputting the argument. 
		   It represents the minimum number of characters written to the output.

		   The [.precision] specifies the number of digits of precision when outputting floating-point values. 
		   Additionally, we can use it to define the length of a substring to extract from a String.

		 * %n - To break the string into separate lines
		   %b - To format boolean values
           %B for boolean Uppercase
           %s - to format simple string
		   %S = Upper case
		   %c is a Unicode character
		   %C
		   %d - accept for byte, short, int, long, and BigInteger
		   %f - float
		   %d	Format decimal (integer) numbers (base 10)
           %e	Format exponential floating-point numbers
           %i	Format integers (base 10)
           %o	Format octal numbers (base 8)
		   %x	Format numbers in hexadecimal (base 16)
		 * 
		 */
		System.out.printf("baeldung%nline%nterminator%n");
		
		System.out.println("------------------------------------------");
		
		System.out.printf("%b%n", null);//false
		System.out.printf("%B%n", false);//FALSE
		System.out.printf("%B%n", 5.3);//TRUE
		System.out.printf("%b%n", "random text");//true
		
		System.out.println("------------------------------------------");
		
		System.out.printf("'%s' %n", "baeldung");
		System.out.printf("'%S' %n", "baeldung");
		
		System.out.println("------------------------------------------");
		
		System.out.printf("'%15s' %n", "baeldung"); //'       baeldung' 
		
		System.out.printf("'%-10s' %n", "baeldung");//'baeldung  '
		
		//If we need to left-justify our string, we can use the – flag:
		
		//we can limit the number of characters in our output by specifying a precision
		//The first x number in %x.ys syntax is the padding. y is the number of chars
		
		System.out.printf("%2.5s %n", "Hi there!"); //Hi th
		
		System.out.println("------------------------------------------");
		
		System.out.printf("%c%n", 's'); //s
		System.out.printf("%C%n", 's'); //S
		
		System.out.println("------------------------------------------");
		
		System.out.printf("simple integer: %d%n", 10000L); //simple integer: 10000
		
		System.out.printf(Locale.US, "%,d %n", 10000); //10,000
		System.out.printf(Locale.ITALY, "%,d %n", 10000); //10.000
		
		System.out.printf("%f%n", 5.1473);//5.147300
		
		System.out.printf("'%5.2f'%n", 5.1473); //' 5.15'
		
		//output in scientific notation, we just use the e conversion-character
		
		System.out.printf("'%5.3e'%n", 5.1473);//'5.147e+00'
		
		System.out.println("------------------------------------------");
		
		/*
		 * Time Formatting
		   First, let's see the list of some useful suffix characters for time formatting:
		   H, M, S characters are responsible for extracting the hours, minutes and seconds from the input Date.
           L, N represent the time in milliseconds and nanoseconds accordingly.
           p adds a.m./p.m. formatting.
           z prints out the time-zone offset.
		 */
		
		Date date = new Date();
		System.out.printf("%tT%n", date);//13:51:15
		
		System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);//hours 12: minutes 53: seconds 46
		
		//to get rid of multiple arguments, we can use the index reference of our input parameter, which is 1$ in our case
		
		System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", date);//12:56:19 pm 848 848000000 +0530 
		
		/*
		 * Date Formatting
		   
           A prints out the full day of the week.
           d formats a two-digit day of the month.
           B is for the full month name.
           m formats a two-digit month.
           Y outputs a year in four digits.
           y outputs the last two digits of the year.
		 * 
		 */
		
		System.out.println("------------------------------------------");
		
		System.out.printf("%1$tA, %1$tB %1$tY %n", date);//Thursday, August 2022
		
		System.out.printf("%1$td.%1$tm.%1$ty %n", date);//04.08.22
		
	}

}
