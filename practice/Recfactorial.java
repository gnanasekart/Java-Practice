class Recfactorial
{
public static void main(String[] args)
{
int no = Recfactorial.factorial(4);
System.out.println(no);
}
static int factorial(int n)
{
if(n==1)
{return 1;
}
else
{
return n*factorial(n-1);
}
}
}