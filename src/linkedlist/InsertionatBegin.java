package linkedlist;

public class InsertionatBegin {

	Node head;

	void insertAtBeginning(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	void deleteAtBeginning() {
		if (head == null) {
			return;
		}
		head = head.next;
	}

	void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	void deleteAtEnd() {
		if (head == null) {
			System.out.println("Empty List");
			return;
		}
		if (head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	void insertAtPosition(int data, int pos) {
		if (pos <= 0) {
			System.out.println("Invalid Position");
			return;
		}
		if (pos == 1) {
			insertAtBeginning(data);
			return;
		}
		Node newNode = new Node(data);
		Node temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Position out of range");
			return;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}

	void deleteAtPosition(int pos) {
		if (head == null) {
			System.out.println("Empty List");
			return;
		}
		if (pos == 1) {
			deleteAtBeginning();
			return;
		}
		Node temp = head;
		for (int i = 1; i < pos - 1 && temp.next != null; i++) {
			temp = temp.next;
		}
		if (temp.next == null) {
			System.out.println("Position out of range");
			return;
		}
		temp.next = temp.next.next;
	}

	void deleteByValue(int val) {
		if (head == null) {
			System.out.println("Empty");
			return;
		}
		if (head.data == val) {
			head = head.next;
			return;
		}
		Node temp = head;
		while (temp.next != null && temp.next.data != val) {
			temp = temp.next;
		}
		if (temp.next == null) {
			System.out.println("value not found");
			return;
		}
		temp.next = temp.next.next;
	}

	void updateByPosition(int pos, int data) {
		if (head == null) {
			System.out.println("Empty");
		}
		Node temp = head;
		for (int i = 1; i < pos && temp != null; i++) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Position out of range");
			return;
		}

		temp.data = data;
	}

	void updateByValue(int oldvalue, int newvalue) {
		if (head == null) {
			System.out.println("empty");
			return;
		}
		Node temp = head;

		while (temp != null) {

			if (temp.data == oldvalue) {
				temp.data = newvalue;
				System.out.println("Value Updated");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Value not found");
	}
	int countNode() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	int search(int value) {
		Node temp=head;
		int pos=1;
		while(temp!=null) {
			if(temp.data==value) {
				return pos;
			}
			temp=temp.next;
			pos++;
		}
		return -1;
	}
	void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "--->");
			temp = temp.next;
		}
		System.out.println("null");
	}
}