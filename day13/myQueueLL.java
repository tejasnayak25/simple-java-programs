package day13;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class myQueueLL {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.display();
        queue.peek();
        queue.remove();
        queue.peek();
        queue.display();
    }
}

class Queue {
    Node top;

    public Queue() {
        this.top = null;
    }

    public void add(int data) {
        Node hello = new Node(data);
        if (top == null) {
            top = hello;
        } else {
            Node current = top;
            while (current.next != null) {
                current = current.next;
            }
            current.next = hello;
        }
        System.out.println("Added");
    }

    public void remove() {
        if (top == null) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Removed: " + top.data);
            top = top.next;
        }
    }

    public void peek() {
        if (top == null) {
            System.out.println("No Peek!");
        } else {
            System.out.println("Top: " + top.data);
        }
    }

    public void display() {
        if (top == null) {
            System.out.println("Queue is empty");
        } else {
            Node current = top;            
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}