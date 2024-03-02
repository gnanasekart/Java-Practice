package SOLID_Principle.Single_Responsiblity_Principle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Student {

    /*
    Coupling
    - It is defined as the level of interdependency between various software components.
    - In the below class save method contains SQL query related to STUDENT table.
    - Tightly Coupled - If we need to change from mySql to different DB means here mySql codes are tightly coupled with save method.
    - Loose Coupled - If we separate the sql code in different class means we can change the DB connection based on our need.
    - Hear we remove the coupling and make it loose by maintaining two different class
        Responsibility - Student - Handle core student profile data
                          StudentRespository - Handle DB operations
    - Always Aim for Loose Coupling as best approach for Single Responsibility Principle.
     */

    private String studentId;
    private Date studentDOB;
    private String address;

    public void save(){
        new StudentRepository().save(this);

            //Serialize object into a string representation
//            String objectstr = MyUtils.serializeIntoAString(this);
//            Connection connection = null;
//            Statement stmt = null;
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
//                stmt = connection.createStatement();
//                stmt.execute("INSERT INTO STUDENT VALUES (" + objectstr +")");
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }

    }

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String studentId){
        this.studentId=studentId;
    }
}
