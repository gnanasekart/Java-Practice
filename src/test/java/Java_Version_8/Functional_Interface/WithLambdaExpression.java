package Java_Version_8.Functional_Interface;

interface inter{
    public void m1();
}

public class WithLambdaExpression {
    public static void main(String[] args) {
        inter i = () -> System.out.println("m1() method implementation");
        i.m1();
    }
}
