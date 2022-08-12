package Serialization_Deserialization;

import java.io.Serializable;

//public class Employee implements Serializable
//{
//   public String firstName;
//   public String lastName;
//   private static final long serialVersionUID = 5462223600l;
//}

public class Employee extends superEmployee {
	public String firstName;
	private static final long serialVersionUID = 5462223600l;
}

class superEmployee implements Serializable{
	public String lastName;
	//	static  String companyName;
	//	transient  String address;
	//	static transient String companyCEO;

	static  String companyName = "TATA";
	//transient final String address = "DEL";
	transient String address = "DEL";

	static transient String companyCEO = "Sekar";
}