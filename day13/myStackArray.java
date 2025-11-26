package day13;

public class myStackArray {
    public static void main(String[] args) {
        Stack o = new Stack(3);
        o.push(10);
        o.push(20);
        o.push(30);
        o.push(40);
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
            System.out.println("Overflow");
        } else {
            top++;
            a[top] = data;
            System.out.println("Pushed");
        }
    }
}