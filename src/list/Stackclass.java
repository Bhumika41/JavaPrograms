package list;
import java.util.Stack;
public class Stackclass {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        // push()
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Stack Elements: " + s);
        // peek()
        System.out.println("Top Element: " + s.peek());
        // pop()
        System.out.println("Removed Element: " + s.pop());
        System.out.println("After Pop: " + s);
        // search()
        System.out.println("Position of 20: " + s.search(20));
        // get()
        System.out.println("Element at index 2: " + s.get(2));
        // contains()
        System.out.println("Contains 30? " + s.contains(30));
        // size()
        System.out.println("Size: " + s.size());
        // firstElement()
        System.out.println("First Element: " + s.firstElement());
        // lastElement()
        System.out.println("Last Element: " + s.lastElement());
        // isEmpty()
        System.out.println("Is Stack Empty? " + s.isEmpty());
        // iterator traversal
        System.out.println("Using For Loop");
        for(int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
        // remove(index)
        s.remove(1);
        System.out.println("After Removing Index 1: " + s);
        // removeElement()
        s.removeElement(40);
        System.out.println("After Removing Element 40: " + s);
        // clear()
        s.clear();
        System.out.println("After Clear: " + s);
        // empty()
        System.out.println("Empty? " + s.empty());
    }
}