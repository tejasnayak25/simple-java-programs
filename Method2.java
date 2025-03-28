// with arguments and without returntype
public class Method2 {
    static void add(int i, int j) {
        System.out.println(i+j);
    }
    public static void main(String[] args) {
        System.out.println("Program Starts");
        add(12, 3);
        add(6, 3);
        add(4, 4);
        System.out.println("Program Ends");
    }
}