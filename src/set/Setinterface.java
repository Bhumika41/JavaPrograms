package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Setinterface {
	

		public static void main(String[] args) {

			System.out.println("HashSet :");
			HashSet s1 = new HashSet();
			
			s1.add("Java");
			s1.add("SQL");
			s1.add("Java");
			s1.add(null);
			System.out.println(s1); // display randomly with unique values 
			
			System.out.println("LinkedHashSet : ");
			LinkedHashSet s2 = new LinkedHashSet();
			s2.add("java");
			s2.add("SQL");
			s2.add("Python");
			s2.add("php");
			s2.add("Android");
			s2.add(null);
			s2.add("Java");
			s2.add("java");
			System.out.println(s2); // display as user inserted with unique values
			
			System.out.println("TreeSet : ");
			TreeSet s3 = new TreeSet();
			s3.add("java");
			s3.add("sql");
			s3.add("python");
			s3.add("php");
			s3.add("android");
			//s3.add(null); //
			s3.add("java");
			System.out.println(s3); // display in ascending order
		}

	

}