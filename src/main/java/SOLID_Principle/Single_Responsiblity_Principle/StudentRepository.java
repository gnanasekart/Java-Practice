package SOLID_Principle.Single_Responsiblity_Principle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRepository {

    public void save(Student student){
        //Serialize object into a string representation
        String objectstr = MyUtils.serializeIntoAString(student);
        Connection connection = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB", "root", "password");
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO STUDENT VALUES (" + objectstr +")");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

class MyUtils {
    public static String serializeIntoAString(Student student){
        return "";
    }
}
