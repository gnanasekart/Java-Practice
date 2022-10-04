package string;

// String comparison 
public class StringConcept
{
	public static void main(String[] args) 
	{
		/*        String name = "Test123";
        //String two = "Test" + 123;
        if(name.equals("Test" + 123)) 
	//if(Objects.equals(name, "test"+123))
{
            System.out.println("same text");
 }                                  

String strobj = new String("Hello");
String obj = "Hello";
if(strobj.equals(obj))
{
System.out.println("equal");
}
if(strobj != obj)
{
System.out.println("not equal");
}
//String intern
String intstr = strobj.intern();
String intstr1 = obj.intern();
if(intstr == obj)
{
System.out.println("intern string equal");
}
if(intstr1 == obj)
{
System.out.println("intern string not equal");
}
		 */
		//Immutable string
		String s1 = "Hello";
		String s2 = s1;
		
		//System.out.println(s1);
		s1 = "helping";
		s1.replace('e', 'a');
		s2 = "help";
		System.out.println(s1);
		// Strings are immutable
		String s = s1.toUpperCase();
		String ss = s1.toLowerCase();
		//System.out.println(s2);
		//System.out.println(s);
		//System.out.println(ss);

	}
}