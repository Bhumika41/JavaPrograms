package mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class mapping {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(101, "bhumi");
		m.put(102, "abc");
		m.put(103, "def");
		m.put(104, "ghi");
		m.put(105, "jkl");
		m.put(30, null);
		m.put(50, null);
		System.out.println(m.get(101));
		m.remove(105, "jkl");
		m.remove("def");
		System.out.println("m :" + m);
		System.out.println(m.containsValue("bhumi"));
		System.out.println(m.containsKey(106));
		System.out.println("1.Methods in map interface:");
		System.out.println("2.get(bhumi) :" + m.get("bhumi"));
		System.out.println("3.Itearting keyset using keyset().iterator:");
		Iterator<Integer> it = m.keySet().iterator();
		while (it.hasNext())
			System.out.println(" " + it.next());
		Set<Integer> s = m.keySet();
		System.out.println("4. Retrive key using set--->keySet():" + s);
		Collection<String> s1 = m.values();
		System.out.println("5.Retrive values using values():" + s1);

		System.out.println("6.retrive values and keys using keyset");
		for (Entry<Integer, String> m1 : m.entrySet()) {
			System.out.println(" " + m1.getKey() + " " + m1.getValue());
		}
		System.out.println("7.Retrive values and keys using Iterator:");
		Iterator<Integer> ir = m.keySet().iterator();
		while (ir.hasNext()) {
			Integer key = ir.next();
			System.out.println(" " + key + "-->" + m.get(key));
		}
		  Map<String, Integer> m2 = new LinkedHashMap<String, Integer>();
		  m2.put("vishal", 10); 
		  m2.put("sachin", 30);
		  m2.put("vaibhav", 20);
		  m2.put(null, 40);
		  m2.put("John", null);
		  
		  System.out.println("LinkedHashMap m2 : " + m2);
		  
		  Map<String, Integer> m3 = new TreeMap<String, Integer>(); 
		  m3.put("vishal",10); 
		  m3.put("sachin", 30); 
		  m3.put("vaibhav", 20);
		 //m3.put(null, 40);
		  m3.put("John", null);
		  System.out.println("TreeMap m3 : " + m3);
		 
		
		  Map<String, Integer> m4 = new Hashtable<String, Integer>();
		  m4.put("vishal",10); 
		  m4.put("sachin", 30); 
		  m4.put("vaibhav", 20);
		 //m4.put(null, 40);
		 // m4.put("John", null);
		  System.out.println("HashTable m4 : " + m4);
	}
}
