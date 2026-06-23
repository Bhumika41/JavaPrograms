package circularlinkedlist;

public class Operation {

	Node head;

	void insertAtBeginning(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			head.next = head;
			return;
		}

		Node temp = head;

		while (temp.next != head) {
			temp = temp.next;
		}

		newNode.next = head;
		temp.next = newNode;
		head = newNode;
	}

	void insertAtEnd(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			head.next = head;
			return;
		}

		Node temp = head;

		while (temp.next != head) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.next = head;
	}

	void deleteAtBeginning() {

		if (head == null) {
			System.out.println("Empty");
			return;
		}

		if (head.next == head) {
			head = null;
			return;
		}

		Node temp = head;

		while (temp.next != head) {
			temp = temp.next;
		}

		temp.next = head.next;
		head = head.next;
	}

	void deleteAtEnd() {

		if (head == null) {
			System.out.println("Empty");
			return;
		}

		if (head.next == head) {
			head = null;
			return;
		}

		Node temp = head;

		while (temp.next.next != head) {
			temp = temp.next;
		}

		temp.next = head;
	}

	int countNode() {

		if (head == null)
			return 0;

		int count = 0;
		Node temp = head;

		do {
			count++;
			temp = temp.next;
		} while (temp != head);

		return count;
	}

	int search(int value) {

		if (head == null)
			return -1;

		Node temp = head;
		int pos = 1;

		do {

			if (temp.data == value) {
				return pos;
			}

			temp = temp.next;
			pos++;

		} while (temp != head);

		return -1;
	}

	void display() {

		if (head == null) {
			System.out.println("Empty");
			return;
		}

		Node temp = head;

		do {

			System.out.print(temp.data + "--->");

			temp = temp.next;

		} while (temp != head);

		System.out.println("(head)");
	}
}