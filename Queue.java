public class Queue {
    int size;
    int[] queue;
    int front, rear;

    public Queue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int item) {
        if(isFull()) {
            System.out.println("Queue is full. Cannot enqueue "+item);
            return;
        }
        queue[++rear] = item;
        System.out.println(item + " enqueued.");
    }

    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int removed = queue[front++];
        System.out.println(removed + " dequeued.");
        return removed;
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        
        return queue[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Front element is: " + q.peek());

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();
    }
}
