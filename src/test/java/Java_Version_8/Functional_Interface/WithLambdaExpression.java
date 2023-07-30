package Java_Version_8.Functional_Interface;



//case 1

interface inter{
    public void m1();
}

public class WithLambdaExpression {
    public static void main(String[] args) {
        inter i = () -> System.out.println("m1() method implementation");
        i.m1();
    }
}
/*
 case 2

interface inter{
   // public void add1(int a, int b);
    public void add(int a, int b);
}

public class WithLambdaExpression {
    public static void main(String[] args) {
        inter i = (a, b) -> System.out.println("a+b = " + (a + b));
        //compiler automatically identify the type instead of mentioning
        i.add(10, 20);
    }
}

If Try to use more than one abstract method in Inter Interface then it throw
java: incompatible types: Java_Version_8.Functional_Interface.inter is not a functional interface
multiple non-overriding abstract methods found in interface Java_Version_8.Functional_Interface.inter

 */
