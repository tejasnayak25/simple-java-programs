package day13;

public class myQueueArray {
    public static void main(String[] args) {
        Queue o = new Queue(3);
        o.push(10);
        o.push(20);
        o.push(30);
        o.push(40);
        o.dis();
        o.pop();
        o.peek();
    }
}

class Queue {
    int a[];
    int top;

    Queue(int size) {
        a = new int[size];
        top = -1;
    }

    public void push(int data) {
        if(top == a.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            top++;
            a[top] = data;
            System.out.println("Pushed");
        }
    }

    public void pop() {
        if(top == -1) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Popped" + a[0]);

            for (int i = 0; i < top; i++) {
                a[i] = a[i+1];
            }

            top--;
        }
    }

    public void peek() {
        if(top == -1) {
            System.out.println("No Peek!");
        } else {
            System.out.println("Peek: " + a[0]);
        }
    }

    public void dis() {
        if(top == -1) {
            System.out.println("Queue is empty!");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(a[i]);
            }
        }
    }
}