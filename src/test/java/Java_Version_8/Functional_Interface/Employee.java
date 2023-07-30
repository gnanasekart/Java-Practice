package Java_Version_8.Functional_Interface;

public class Employee {
    int eno;
    String ename;

    Employee(int eno, String ename){
        this.ename=ename;
        this.eno=eno;
    }

    public String toString(){
        return eno+":"+ename;
    }

    public static void main(String[] args) {
//        Employee e = new Employee(10, "Gnana");
//
//        System.out.println(e);
    }
}
