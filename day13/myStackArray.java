package day13;

public class myStackArray {
    public static void main(String[] args) {
        Stack o = new Stack(3);
        o.peek();
        o.push(10);
        o.push(20);
        o.dis();
        o.pop();
        o.push(30);
        o.push(40);
        o.dis();
        o.peek();
        o.pop();
        o.pop();
        o.pop();
        o.pop();
    }
}

class Stack {
    int a[];
    int top;

    Stack(int size) {
        a = new int[size];
        top = -1;
    }

    public void push(int data) {
        if(top == a.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            a[top] = data;
            System.out.println("Pushed");
        }
    }

    public void dis() {
        if(top == -1) {
            System.out.println("Stack is empty!");
        }
        for (int i = 0; i <= top; i++) {
            System.out.println(a[i]);
        }
    }

    public void peek() {
        if(top == -1)
            System.out.println("No Peek!");
        else
            System.out.println(a[top]);
    }

    public void pop() {
        if(top == -1)
            System.out.println("Stack Underflow!");
        else {
            System.out.println("Popped: " + a[top]);
            top--;
        }
    }
}