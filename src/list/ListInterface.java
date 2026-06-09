package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>(); //upcasting
		l.add("Java");
		l.add("SQL");
		l.add("Python");
		l.add("php");
		l.add("android");
		l.add(null);
		System.out.println(l);
		
		l.add(1, "C++");
		l.add("Java");
		System.out.println(l);
		
		l.set(4, "GoLang");
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);
		
		l.remove("GoLang");
		System.out.println(l);
		
		System.out.println(l.get(2));
		System.out.println(l.indexOf("Java"));
		System.out.println(l.lastIndexOf("Java"));
		System.out.println(l);
		
		System.out.println(l.subList(1, 3));
		System.out.println(l.subList(0, 4));
		
		System.out.println("using for each --------");
		for(String s : l) {
			System.out.println(s);
		}
		System.out.println("using for loop --------");
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		
		System.out.println("using Iterator --------");
		Iterator<String> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Usinng ListIterator--------");
		ListIterator<String> litr = l.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("Usinng ListIterator previous--------");
		//ListIterator litr = l.listIterator();
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}
	
	
	
	

	
	
	
}

