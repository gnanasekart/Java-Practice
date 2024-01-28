package Java_Version_8.functionalInterface;

import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_Practice {

    public static void main(String[] args) {
        Employee emp = new Employee(1, "gnana", LocalDate.of(2024, 01, 14), 10000.00);
        System.out.println(emp.toString());
        PredicateMethod();
    }

    public static void predicateMethod1(){
        Predicate<Integer> pre = x -> x>10;
        System.out.println("Predicate test method = " +pre.test(4));

        //chaining
        System.out.println("Predicate AND && Test method = " +pre.and(x -> x<20).test(12));
    }

    /*
    In Java 11, Predicate class has a new method not().
    It returns a Predicate that is the negation of the supplied predicate.
    Internally, this is accomplished by returning the result of the calling predicate.negate().
     */

    public static void negateMethod(){
        Predicate<Integer> odd = x -> x%2==0;
        Predicate<Integer> even = Predicate.not(odd);

        List<Integer> list = Arrays.asList(1,2,3,4,5,5,6);

        List<Integer> evenList = list.stream().filter(odd).collect(Collectors.toList());

        List<Integer> oddNegateList = list.stream().filter(odd.negate()).collect(Collectors.toList());

        List<Integer> oddList = list.stream().filter(even).collect(Collectors.toList());

        System.out.println("Even numbers = "+evenList.toString());
        System.out.println("odd numbers = "+oddList.toString());
        System.out.println("odd Negate numbers = "+oddNegateList.toString());
    }

    public static void PredicateMethod(){
        Predicate<Employee> isAdult = e -> e.getAge() > 18;
        Predicate<Employee> isMale = e -> e.getName().equalsIgnoreCase("M");
        Predicate<Employee> isAdultAndMale = isAdult.and(isMale);
        Predicate<Employee> isAdultOrMale = isAdult.or(isMale);
        Predicate<Employee> isMinor = isAdult.negate();

        List<Employee> eList = List.of();

        BiPredicate<Integer, String> isAdultmale = (p1, p2) -> p1 > 18 && p2.equalsIgnoreCase("M");
        List<Employee> adultAndMale = eList.stream().filter(x -> isAdultmale.test(x.getAge(), x.getName())).collect(Collectors.toList());
    }
}
