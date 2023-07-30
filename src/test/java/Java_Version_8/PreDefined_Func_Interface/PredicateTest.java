package Java_Version_8.PreDefined_Func_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

//Predicate is a Functional Interface so it accept LE
//Predicate contains only one method as test and it accept only one arguments

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<Integer> p = I -> I>10;
        System.out.println(p.test(100));

        //System.out.println(p.test("sekar"));//Incompactable type

        Predicate<String> ps = s -> s.length()>10;
        System.out.println(ps.test("abcsdew"));

        Predicate<Collection> pc = c -> c.isEmpty();
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println("list is empty = "+pc.test(l));

        int[] x = {0,5,10,15,20,25,30};

        Predicate<Integer> p1 = i->i>10;
        Predicate<Integer> p2 = i->i%2==0;

        System.out.println("number greater than 10 are");//15,20,25,30
        method(p1, x);

        System.out.println('\n'+"number even or not are");//0,10,20,30
        method(p2, x);

        System.out.println('\n'+"number not greater than 10 are");//0,5,10
        method(p1.negate(), x);

        System.out.println('\n'+"number greater than 10 and even are");//20, 30
        method(p1.and(p2), x);

        System.out.println('\n'+"number greater than 10 or even are");//0,10,15,20,25,30
        method(p1.or(p2), x);

        //to find string starts with 'K'
        Predicate<String> startsWithK = s-> s.charAt(0)=='K';

        //to find and remove null and empty from list
        Predicate<String> pList = s -> s!=null && s.length()!=0;

        //validate custome class
        Predicate<User> pUser = user -> user.username.equals("gnana") && user.pswd.equals("****");

        String uname = "gnana";
        String pwd = "****";
        User user = new User(uname, pwd);
        if(pUser.test(user)){
            System.out.println("valid user details");
        }

        //For Employee format
        ArrayList<Employee> list = new ArrayList<>();
        Employee e1 = new Employee("gnana", "DEO", 30000, "Bangalore");
        list.add((e1));
        System.out.println(list);
    }

    public static void method(Predicate<Integer> p, int[] arr){
        for(int x: arr){
            if(p.test(x)){
                System.out.print(x+" ");
            }
        }
    }
}

class User{
    String username;
    String pswd;

    User(String username, String pswd){
        this.username = username;
        this.pswd = pswd;
    }
}

class Employee{
    String name;
    String designation;
    float salary;
    String city;

    public Employee(String name, String designation, float salary, String city) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.city = city;
    }

    public String toString(){
        String s = String.format("(%s, %s, %.2f, %s)", name, designation, salary, city);
        return s;
    }

//%f denotes float value with 6 decimal digit to reduce that we given .2f as two decimal digit 30000.00


}
