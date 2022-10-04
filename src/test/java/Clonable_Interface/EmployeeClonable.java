package Clonable_Interface;

class EmployeeClonable implements Cloneable{

	int id;
	String name;

	EmployeeClonable(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Main{

	public static void main(String[] args) throws CloneNotSupportedException {
		EmployeeClonable e = new EmployeeClonable(1, "sekar");
		EmployeeClonable e1 = (EmployeeClonable) e.clone();

		System.out.println("Original Employee object: " + e.id+" "+e.name);  
		System.out.println("Cloned Student object: " + e.id+" "+e1.name);  
	}
}