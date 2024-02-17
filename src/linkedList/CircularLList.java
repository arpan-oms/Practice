package linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
public class CircularLList {
    Node head, tail;
    public static void main(String[] args) {
        CircularLList  list1 = new CircularLList();
        list1.insertElements(2);
        list1.insertElements(7);
        list1.insertElements(8);
        list1.displayElements();
        list1.deleteElement();
        System.out.println("delete");
        list1.displayElements();
    }

    void insertElements(int data) {
        Node newNode  = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void deleteElement() {
        if (tail!=head) {
            head = head.next;
            tail.next = head;
        } else {
            head = tail = null;
        }
    }

    void displayElements () {
        Node n1=head;
        if (tail == null && head == null) {
            System.out.println("Circular linked list is empty, nothing to display");
        } else {
            do {
                System.out.println(n1.data);
                n1 = n1.next;
            } while (n1!=head);
        }
    }
}
