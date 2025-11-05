package day10;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
