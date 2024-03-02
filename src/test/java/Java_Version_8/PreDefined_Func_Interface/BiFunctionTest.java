package Java_Version_8.PreDefined_Func_Interface;


import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionTest {
    public static void main(String[] args) {
        //studentBiFunction();
        employeeBiFunction();
    }

    private static void employeeBiFunction() {
        BiEmployee e = new BiEmployee(101, "Gnana", 1500);
        TimeSheet t = new TimeSheet(101, 25);

        BiFunction<BiEmployee, TimeSheet, Double> f = (emp, ts) -> emp.wages * ts.days;
        System.out.println(f.apply(e, t));
    }

    public static void studentBiFunction(){
        ArrayList<Student> list = new ArrayList<>();
        BiFunction<String, Integer, Student> f = (name, rollno) -> new Student(name, rollno);
        list.add(f.apply("gnana", 100));
        list.add(f.apply("sekar", 200));

        for(Student s: list){
            System.out.println(s.name+" - "+s.rollNo);
        }
    }

}
class Student{
    String name;
    int rollNo;

    Student(String name, int rollno){
        this.name=name;
        this.rollNo=rollno;
    }
}

//---------------------------------------------------

class BiEmployee{
    int eno;
    String name;
    double wages;

    BiEmployee(int eno, String name, double wages){
        this.eno=eno;
        this.name=name;
        this.wages=wages;
    }
}

class TimeSheet{
    int eno;
    int days;

    TimeSheet(int eno, int days){
        this.eno=eno;
        this.days=days;
    }
}