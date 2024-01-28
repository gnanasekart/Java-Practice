package Java_Version_8.functionalInterface;

import java.util.function.Function;
public class Function_practice {

    public static void main(String[] args) {
        functionCompose();
    }

    public static void funtionMethod(){
        Function<String, Integer> fun = x -> x.length();
        System.out.println(fun.apply("This is test method"));

        Function<Integer, Integer> fun1 = x -> x*2;
        System.out.println(fun.andThen(fun1).apply("This is another test method"));

        Function<Integer, Integer> fun2 = x -> x+x;
        fun2=fun2.compose(a -> 3*a);
        System.out.println(fun2.apply(2));

        Function<String, String> id = Function.identity();
        System.out.println(id.apply("Sekar"));
    }

    /*
    f1.andThen(f2).apply(i)
    => f1.apply(i) = f
    => f2.apply(f) = result
     */
    public static void functionAndThen(){
        Function<Integer, Integer> f1 = x -> 2*x;//4
        Function<Integer, Integer> f2 = x -> x*x*x;//4*4*4 = 64
        System.out.println("andThen = "+f1.andThen(f2).apply(2));
    }

    /*
    f1.compose(f2).apply(i)
    => f2.apply(i) = f
    => f1.apply(f) = result
     */
    public static void functionCompose(){
        Function<Integer, Integer> f1 = x -> 2*x;//16
        Function<Integer, Integer> f2 = x -> x*x*x;//2*2*2 = 8
        System.out.println("compose = "+f1.compose(f2).apply(2));
    }
}
