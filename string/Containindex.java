import java.lang.String;
class Containindex
{
public static void main(String[] args)
{
/*
String a = "Hello world";
String b = "hello";
String c = "HelLo";
String d = "This is long is string";

System.out.println("hello".contains(b));
System.out.println(a.indexOf('o'));
System.out.println(d.indexOf('l'));
System.out.println(d.indexOf("is"));
System.out.println(d.indexOf("tHIs"));

String e = "This;is;long;is;string";
String[] f = e.split(";");
System.out.println(f.toString());
System.out.println(e.split("\\s+"));
String[] firstNames = "Mickey, Frank, Alicia, Tom".split(", ");
System.out.println(firstNames);
*/

String s = "a|b|c";
//String regex = Pattern.quote("|");
//String[] arr = s.split(regex);
//System.out.println(arr);
String[] arr1 = s.split("\\|");
System.out.println(arr1);
}
}
