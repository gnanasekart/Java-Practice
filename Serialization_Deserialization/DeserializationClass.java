package Serialization_Deserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationClass {
	//	public static void main(String[] args) {
	//		Employee emp = null;
	//		try {
	//			FileInputStream fileIn = new FileInputStream("./employee.txt");
	//			ObjectInputStream in = new ObjectInputStream(fileIn);
	//			emp = (Employee) in.readObject();
	//			in.close();
	//			fileIn.close();
	//		} catch (IOException i) {
	//			i.printStackTrace();
	//			return;
	//		} catch (ClassNotFoundException c) {
	//			System.out.println("Employee class not found");
	//			c.printStackTrace();
	//			return;
	//		}
	//		System.out.println("Deserializing Employee...");
	//		System.out.println("First Name of Employee: " + emp.firstName);
	//		System.out.println("Last Name of Employee: " + emp.lastName);
	//	}


	public static void main(String[] args) {
		Employee emp = null;
		try {
			FileInputStream fileIn = new FileInputStream("./employee.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (Employee) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		} catch (ClassNotFoundException c) {
			System.out.println("Employee class not found");
			c.printStackTrace();
			return;
		}
		System.out.println("Deserializing Employee...");
		System.out.println("First Name of Employee: " + emp.firstName);
		System.out.println("Last Name of Employee: " + emp.lastName);
		System.out.println("Company Name: "+emp.companyName);
		System.out.println("Company CEO: "+emp.companyCEO);
		System.out.println("Company Address: "+emp.address);
	}
}



/*
 *OUTPUT
 *
Deserializing Employee...
First Name of Employee: Vivekanand
Last Name of Employee: Gautam
Company Name: TATA
Company CEO: Sekar
Company Address: null
 * 
 * 
 
Bullet Point
1. A static variable cannot be serialized.
2. While de-serializing a value can be available for Static variables if the same is provided while initialization of the base class.
3. It doesn’t mean that static variable will be serialized. It only means that the static variable will be initialized with the same value, 
   it is assigned while loading the class(Which is TATA in this case). If classes are not loaded before(New JVM). Please pay attention to example code.
4. In case class is already loaded in JVM and static variable value has been changed then the changed value will be displayed.
5. If the variable is defined as Static and Transient both than static modifier will govern the behavior of variable and not Transient.
6. Static and Transient is different. In cases, their behavior looks the same, but not always. 
   If you have assigned a value to a variable while loading the class then that value will be assigned to the static variable while de-serializing the class but not to transient. 
   So if you are using both of these modifiers with a variable, then in that sense, I am saying that static will take precedent to transient.
7. Transient variables value will not be saved. Also, it can not be assigned any value while de-serialization process. Which is different from static behavior.
*/