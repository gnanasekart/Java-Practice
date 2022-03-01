package string;

import java.util.*;

class Searchchar
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter char");
String[] a = sc.next();
char[] b = a.toCharArray();
System.out.println(a);
System.out.println("enter char to search");
String c = sc.next();
char d = c.charAt(0);

for (int i=0; i<=a.length; i++)
{
if(b[i] == d)
{
if(d>= 'a' && d <= 'z')
{
d-=32;
}
else if(d >= 'A' && d <= 'Z')
{
d+=32;
}
a[i]=d;
break;
}
}
//sc=String.valueOf(a);
//System.out.println(sc);
}
}