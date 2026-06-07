package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Writefile {
	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("D:\\java\\src\\filehandling\\file.txt");
	fw.write("Welcome to technical training\n");
	fw.write("File handling");
	fw.close();
	}
}
