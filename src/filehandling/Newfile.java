package filehandling;

import java.io.File;
import java.io.IOException;

public class Newfile{
	public static void main(String[] args)throws IOException{

		File f=new File("D:\\java\\src\\filehandling\\file.txt");

		if(f.createNewFile()){
			System.out.println("File created");
		}
		else{
			f.exists();
			System.out.println("problem in creating file");
		}
	}
}