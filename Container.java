public class Container {
    int capacity;

    Container(int a) {
        capacity = a;
    }

    public static void main(String[] args) {
        Container c = new Container(500);
        System.out.println(c.capacity);
        Container c1 = new Container(1000);
        System.out.println(c1.capacity);
        Container c2 = new Container(1500);
        System.out.println(c2.capacity);
    }
}
