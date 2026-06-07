package multithreading;
public class Main {

    public static void main(String[] args) {

        Mythread t1 = new Mythread();

        MyThread1 t2 = new MyThread1();

        t1.start();

        t2.start();
    }
}
