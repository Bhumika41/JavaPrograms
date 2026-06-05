package abstraction;

abstract class Example{
    abstract void show();
    abstract void add();
}
class Student extends Example{
    void show(){
        System.out.println("zxcvbnm");
    }
    void add(){
        System.out.println("asdfghjk");
    }
    void display() {
    	System.out.println("qwertyuiop");
    }
}
class Mark extends Student{
	void show() {
		System.out.println("86");
	}
	void add() {
		System.out.println("3456789");
	}
	void display() {
		System.out.println("34567890");
	}
}
public class abs{
    public static void main(String[] args){
        Student s = new Student();
        s.show();
        s.add();
        s.display();
    }
}