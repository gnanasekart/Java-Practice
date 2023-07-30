package Java_Version_8.PreDefined_Func_Interface;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {
    public static void main(String[] args) {
        Function<String, Integer> fun = s -> s.length();
        //System.out.println(fun.apply("gnana"));

        ArrayList<EmployeeFunc> l = new ArrayList<>();
        populateData(l);
        Predicate<EmployeeFunc> pe = e -> e.salary < 4500;
        Function<EmployeeFunc, EmployeeFunc> sal = e -> {
            e.salary = e.salary + 477;
            return e;
        };

        ArrayList<EmployeeFunc> al = new ArrayList<>();
        for (EmployeeFunc e : l) {
            if (pe.test(e)) {
                al.add(sal.apply(e));
            }
        }
        //System.out.println(al);

        //--------------------------------------------

        Function<Integer, Integer> f1 = i -> 2 * i;//4
        Function<Integer, Integer> f2 = i -> i * i * i;//64
        System.out.println(f1.andThen(f2).apply(2));//64

        Function<Integer, Integer> f3 = i -> 2 * i;//16
        Function<Integer, Integer> f4 = i -> i * i * i;//8
        System.out.println(f3.compose(f4).apply(2));//16

        //find first name with default string length
        String username = "GnanaSekar";
        Function<String, String> f5 = s -> s.substring(0, 5);
        Function<String, String> f6 = s -> s.toLowerCase();
        if (f5.andThen(f6).apply(username).equals("gnana")) {
            System.out.println("correct");
        }

        //---------------------------------------

        Function<String, String> id = Function.identity();
        String s2 = id.apply("gnana");
        System.out.println(s2);
    }

    private static void populateData(ArrayList<EmployeeFunc> l) {
        l.add(new EmployeeFunc("gnana", "ceo", 1000, "cbe"));
        l.add(new EmployeeFunc("sekar", "ceo", 2000, "cfe"));
        l.add(new EmployeeFunc("gana", "ceo", 3000, "cde"));
        l.add(new EmployeeFunc("gna", "ceo", 4000, "cee"));

    }
}

class EmployeeFunc {
    String name;
    String designation;
    float salary;
    String city;

    public EmployeeFunc(String name, String designation, float salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public String toString() {
        String s = String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);
        return s;
    }
}
