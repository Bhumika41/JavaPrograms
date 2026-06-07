package filehandling;

import java.io.File;
import java.io.IOException;

public class Filemethods {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\java\\src\\filehandling\\file.txt");

		if(f.createNewFile()){
			System.out.println("File created");
		}
		else{
			System.out.println("Exists:"+f.exists());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getName());
			System.out.println(f.delete()?"File deleted successfully":"File not deleted");
	}
	}
}

