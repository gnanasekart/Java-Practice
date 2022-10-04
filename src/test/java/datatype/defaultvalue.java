package datatype;

class defaultvalue
{
int a ;
double b;
long c;
char d;
String ear;
boolean f;
byte g;
short h;
public static void main(String[] args)
{

defaultvalue obj = new defaultvalue(); 

System.out.println(obj.a);//0
System.out.println(obj.b);//0.0
System.out.println(obj.c);//0
System.out.println(obj.d);//empty space
System.out.println(obj.ear);//null
System.out.println(obj.f);//false
System.out.println(obj.g);//0
System.out.println(obj.h);//0
}
}