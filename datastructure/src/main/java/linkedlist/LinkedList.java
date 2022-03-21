package linkedlist;

public class LinkedList {
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
            this.next = null;
        }

        Node(int val, Node next) {
            this.next = next;
            this.value = val;
        }
    }

    public void insertAtBeginning(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    public void insertAfter(Node node, int data) {
        if (node == null) {
            System.out.println("Given previous node is null");
            return;
        }
        Node insertNode = new Node(data);
        insertNode.next = node.next;
        node.next = insertNode;
    }

    public void insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node insertNode = new Node(data);
        insertNode.next = null;

        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        node.next = insertNode;
    }

    public void deleteNode(int position) {
        if (head == null) {
            return;
        }
        Node node = head;
        if (position == 0) {
            head = node.next;
            return;
        }
        for (int i = 0; node != null && i < position - 1; i++) {
            node = node.next;
        }
        if (node == null || node.next == null) {
            return;
        }
        Node next = node.next.next;
        node.next = next;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node.value + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(12);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;
        while (linkedList.head != null) {
            System.out.println(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}
// time complexity
//search : o(n)
//insert : o(1)
//deletion : o(1)

//space complexity o(n)

//Application
//dynamic memory allocation
//undo functionality for software
//hash tables , graphs , impl in stack and queue