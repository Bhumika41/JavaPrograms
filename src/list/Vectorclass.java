package list;

import java.util.Vector;
public class Vectorclass {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        System.out.println("Vector: " + v);
        v.add(1,50);
        System.out.println("After adding at index 1: " + v);
        v.set(2,100);
        System.out.println("After replacing: " + v);
        v.remove(3);
        System.out.println("After removing index 3: " + v);
        System.out.println("Element at index 2: " + v.get(2));
        System.out.println("Size: " + v.size());
        System.out.println("Contains 20? " + v.contains(20));
        System.out.println("Using for loop");
        for(int i=0;i<v.size();i++) {
            System.out.println(v.get(i));
        }
    }
}