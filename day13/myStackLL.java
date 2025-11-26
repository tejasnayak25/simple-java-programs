package day13;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class myStackLL {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.display();
    }
}

class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int data) {
        Node hello = new Node(data);
        hello.next = top;
        top = hello;
        System.out.println("Pushed");
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped: " + top.data);
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
        if(top == null) {
            System.out.println("Stack is empty");
        } else {
            Node current = top;
            String s = "";
            while (current != null) {
                s = current.data + " " + s;
                current = current.next;
            }
            System.out.println(s);
        }
    }
}