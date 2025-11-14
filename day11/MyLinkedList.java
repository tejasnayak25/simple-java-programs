package day11;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node sec = new Node(20);
        Node tail = new Node(30);

        head.next = sec;
        sec.next = tail;
        tail.next = null;

        Node n = head;
        while (n!=null) {
            System.out.print(n.data);
            if(n.next != null)
                System.out.print(" -> ");
            n = n.next;
        }
    }
}
