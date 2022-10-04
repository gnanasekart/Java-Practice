package FileTypes;

import java.io.File;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {

		File file = new File("sekar.txt");
		System.out.println(file.exists());//false for first time
		file.createNewFile();
		/*
		System.out.println(file.canWrite());//true
		System.out.println(file.canRead());//true

		System.out.println(file.isFile());//true
		System.out.println(file.isDirectory());//false
		System.out.println(file.isAbsolute());//false
		System.out.println(file.isHidden());//false

		System.out.println(file.getAbsolutePath());//C:\..\..\..\Java-Practice\sekar.txt
		System.out.println(file.canExecute());


		System.out.println(file.getCanonicalPath());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getName());
		 */
		File dir = new File("C:\\documents-studies\\Git Repo\\Java repo\\Java-Practice\\newFoldersForFile");
		file.mkdir();
		File d = new File(dir, "tgs.txt");
		
		File f1 = new File("C:\\documents-studies\\Git Repo\\Java repo\\Java-Practice");

		String[] ff = f1.list();

		for(String f: ff) {
			File fv = new File(f1, f);
			if(fv.isFile()) {
				//System.out.println("file name = "+fv);
			} else if(fv.isDirectory()) {
				//System.out.println("Dir name = "+fv);
			}
		}
	}

}
