package practice;

import java.time.*;
class Swap
{
public static void main(String[] args)
{
Instant start = Instant.now();
/*long startime = System.currentTimeMillis();
 swap without third variable
int a=10, b=20;
a = a+b; //30
b = a-b; //10
a = a-b; //20
System.out.println(a+" "+b);
*/

int a=10, b=20, t;

t = a;
a = b;
b = t;
System.out.println(a+" "+b);

Instant end = Instant.now();
System.out.println(Duration.between(start, end).toMillis());

//long endtime = System.currentTimeMillis();
//System.out.println("time is= "+(endtime - startime)+ "ms"); 
}
}
