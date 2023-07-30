package Java_Version_8.Functional_Interface;



import Collection.Collection_Map.Treemap;
import org.junit.Test;

import java.util.*;

//Using Collections concept
public class SortingWithLambdaExp {

    public static void main(String[] args) {
        customComparator();

    }

    @Test
    public static void list() {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(0);
        l.add(6);
        l.add(3);
        l.add(11);
        l.add(1);
        l.add(110);

        //without lambda expression
        //Collections.sort(l, new MyComparator());

        //with lambda expression
        Collections.sort(l, (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
        System.out.println(l);
    }

    @Test
    public static void treeSet() {
        TreeSet<Integer> l = new TreeSet<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
        l.add(10);
        l.add(0);
        l.add(6);
        l.add(3);
        l.add(11);
        l.add(1);
        l.add(110);
        System.out.println(l);
    }

    @Test
    public static void treeMap() {
        TreeMap<Integer, String> l = new TreeMap<>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
        l.put(10, "gnana");
        l.put(0, "sekar");
        l.put(6, "sunny");
        l.put(3, "bunny");
        l.put(11, "sun");
        l.put(1, "chinny");
        l.put(110, "binny");
        System.out.println(l);
    }

    @Test
    public static void customComparator(){
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(100, "gnana"));
        emp.add(new Employee(200, "Sekar"));
        emp.add(new Employee(130, "gnana"));
        emp.add(new Employee(250, "Sekar"));
    Collections.sort(emp, (e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
    //Collections.sort(emp, new MyComparatorEmployee());
        System.out.println(emp);
    }
}

class MyComparator implements Comparator<Integer> {
    public int compare(Integer i1, Integer i2) {
        if(i1>i2) return -1;
        else if(i1<i2) return 1;
        else return 0;

       // return (i1 > i2) ? -1 : (i2 < i2) ? +1 : 0;
    }
}

class MyComparatorEmployee implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
//        if(e1.eno>e2.eno) return -1;
//        else if(e1.eno<e2.eno) return 1;
//        else return 0;

        return (e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0;
    }
}