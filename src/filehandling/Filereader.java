package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filereader{
	public static void main(String[] args)throws IOException{
		//READ CHARACTER BY CHARACTER
		FileReader fr=new FileReader("D:\\java\\src\\filehandling\\file.txt");
		int ch;
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}
		fr.close();
		//BUFFER READER
		BufferedReader br=new BufferedReader(new FileReader("D:\\java\\src\\filehandling\\file.txt"));
		String line;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();
	}
}