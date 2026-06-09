package list;

import java.util.ArrayList;

public class Arraylistclass {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<Integer>();

        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);

        System.out.println("ArrayList: " + a1);

        a1.add(1,50);
        System.out.println("After adding at index 1: " + a1);

        a1.set(2,100);
        System.out.println("After replacing: " + a1);

        a1.remove(3);
        System.out.println("After removing index 3: " + a1);
        System.out.println("Element at index 2: " + a1.get(2));
        System.out.println("Size: " + a1.size());
        System.out.println("Contains 20? " + a1.contains(20));

        for(int i=0;i<a1.size();i++) {
            System.out.println(a1.get(i));
        }
    }
}