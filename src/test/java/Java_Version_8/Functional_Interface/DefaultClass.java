package Java_Version_8.Functional_Interface;

interface Left{
    public void m1();
    default void m2(){
        System.out.println("left m2 implementation");
    }

    public static void main(String[] args) {
        System.out.println("hi");
    }
}

interface Right{
    public void m1();
    default void m2(){
        System.out.println("right m2 implementation");
    }
}

public class DefaultClass implements Left, Right {
    public static void main(String[] args) {
        DefaultClass df = new DefaultClass();
        df.m1();
    }

    public void m1() {
        Left.super.m2();
        Right.super.m2();
        System.out.println("class implement");
    }

    @Override
    public void m2() {
        Left.super.m2();
    }
}
