package J8_Method_Reference;

interface E{
	Employee getEmployee();
}

interface F{
	Employee getEmployee(String name, int age);
}

class Employee{
	String name;
	int age;
	
	public Employee() {	}
	
	public Employee(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public void getInfo() {
		System.out.println("From Employee class");
	}
}

public class ConstructorReference {
	
	public static void main(String[] args) {
		
		//Lambda expression
		E e = () -> new Employee();
		e.getEmployee().getInfo();
		
		F f = (name, age) -> new Employee(name, age);
		f.getEmployee("sekar", 20).getInfo();
		
		//Method Reference
		E e1 = Employee::new;
		e1.getEmployee().getInfo();
		
		F f1 = Employee::new;
		f1.getEmployee("gnana", 22).getInfo();
	}
}