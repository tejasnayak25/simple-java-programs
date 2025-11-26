package day12;

public class MyDLL {
    public static void main(String[] args) {
        DLL o = new DLL();
        o.insert(10);
        o.insert(20);
        o.insert(30);

        o.dis1();
        System.out.println();
        o.dis2();
    }
}

class Node {
    Node prev;
    int data;
    Node next;

    Node(int d) {
        this.data = d;
    }
}

class DLL {
    Node head;
    Node tail;

    DLL() {
        head = tail = null;
    }

    void insert(int data) {
        Node hello = new Node(data);
        if(head == null) {
            head = hello;
            tail = hello;
        } else {
            tail.next = hello;
            hello.prev = tail;
            tail = hello;
        }
    }

    void dis1() {
        Node n = head;
        while(n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
    }

    void dis2() {
        Node n = tail;
        while(n != null) {
            System.out.print(n.data + " -> ");
            n = n.prev;
        }
    }
}