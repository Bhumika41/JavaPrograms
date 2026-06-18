package linkedlist;

public class Mainmethod {
    public static void main(String[] args) {
        InsertionatBegin list = new InsertionatBegin();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        list.display();
        list.deleteAtBeginning();
        list.display();
        list.insertAtEnd(60);
        list.display();
        list.deleteAtEnd();
        list.display();
        list.insertAtPosition(123, 4);
        list.display();
        list.deleteAtPosition(5);
        list.display();
        list.deleteByValue(30);
        list.display();
        list.updateByPosition(3, 80);
        list.display();
        list.updateByValue(4, 246);
        list.display();
        System.out.println("Count:"+list.countNode());
        list.search(4);
        list.display();
}}
