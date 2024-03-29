package Serialization_Deserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaitonClass {

	//	public static void main(String[] args) {
	//		Employee emp = new Employee();
	//		emp.firstName = "Vivekanand";
	//		emp.lastName = "Gautam";
	//
	//		try {
	//			FileOutputStream fileOut = new FileOutputStream("./employee.txt");
	//			ObjectOutputStream out = new ObjectOutputStream(fileOut);
	//			out.writeObject(emp);
	//			out.close();
	//			fileOut.close();
	//			System.out.printf("Serialized data is saved in ./employee.txt file");
	//		} catch (IOException i) {
	//			i.printStackTrace();
	//		}
	//	}



	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.firstName = "Vivekanand";
		emp.lastName = "Gautam";
		superEmployee.companyName = "JBT";
		//Below part needs to be removed in case address field is made final
		//emp.address = "MUM";
		superEmployee.companyCEO = "ME CEO";
		emp.address = "BTECH";

		try {
			FileOutputStream fileOut = new FileOutputStream("./employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.print("Serialized data is saved in ./employee.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
