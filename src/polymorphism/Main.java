package polymorphism;
class Person {
    void display(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}
class S extends Person {
    @Override
    void display(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}
class S1 extends Person {
    @Override
    void display(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}
public class Main {
    public static void main(String[] args) {
        S s = new S();
        S1 s1 = new S1();
        s.display("Bhumi",21);
        s1.display("asdf",12);
    }
} 