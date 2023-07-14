package Java_Version_8.J8_Method_Reference;

interface Ai {
	void sayHello();
}

class SuperClass {
	public void superHello(){
		System.out.println("I am inside SuperTest class");
	}
}

class ChildClass extends SuperClass{
	public void childHello() {
		System.out.println("I am inside SubTest class");
	}

	public void testHello() {
		//***Using Method reference :super class method***//
		Ai a1= super::superHello;
		a1.sayHello();

		//***Using Lambda Expression :super class method***//
		Ai a3= () -> System.out.println("I am inside SuperTest class");
		a3.sayHello(); 

		//***Using Method reference :current class method***//
//		Ai a2= this::childHello;
//		a2.sayHello();

		//***Using Lambda Expression :current class method***//
		Ai a4= () -> System.out.println("I am inside SubTest class");
		a4.sayHello();
	}
}

public class Ref_of_super_this{
	public static void main(String[] args) {
		new ChildClass().testHello();
	}
}