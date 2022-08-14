package Collection_Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		try {
			//FileReader fr = new FileReader(".//Collection_Map//inputfile.properties");
			//FileInputStream fis = new FileInputStream(".//Collection_Map//inputfile.properties"); 
			
			Properties prop = new Properties();
			//prop.load(fis);
			prop.setProperty("one", "two");
			prop.setProperty("two", "three");
			
			//If there is any data already exist in properties file means it will be delete and update with new data
			//prop.store((new FileWriter("inputfile.properties")), "comment" );
			prop.store(new FileOutputStream(".//Collection_Map//inputfile.properties"), "nice");
			System.out.println(prop);
			String name = prop.getProperty("name");
			System.out.println("name = "+name);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}