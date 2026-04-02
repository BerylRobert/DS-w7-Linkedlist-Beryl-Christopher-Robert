package linked.list;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void delete(int key) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found.");
        } else {
            current.next = current.next.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("Insert at beginning: 20, 10");
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        list.display();

        System.out.println("Insert at end: 30, 40");
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display();

        System.out.println("Search for 30:");
        System.out.println(list.search(30));

        System.out.println("Delete 20:");
        list.delete(20);
        list.display();

        System.out.println("Delete 10:");
        list.delete(10);
        list.display();

        System.out.println("Search for 100:");
        System.out.println(list.search(100));
    }
}