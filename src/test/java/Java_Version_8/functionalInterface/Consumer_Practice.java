package Java_Version_8.functionalInterface;

import javax.sound.midi.Soundbank;
import java.util.function.Consumer;

public class Consumer_Practice {
    public static void main(String[] args) {
        chaining();
    }

    public static void consumerMethod() {
        Consumer<Integer> cons = i -> System.out.println(i * i);
        cons.accept(2);
    }

    /*
    Chaining method - andThen()
    c1.andThen().c2.andThen().c3.andThen().accept(m);
    c1.apply(i)=f
    c2.apply(f)=f
     */

    public static void chaining(){
        Consumer<String> c1 = m -> System.out.println("One");
        Consumer<String> c2 = m -> System.out.println("two");
        Consumer<String> c3 = m -> System.out.println("three");

        c1.andThen(c2).andThen(c3).accept("");

    }
}
