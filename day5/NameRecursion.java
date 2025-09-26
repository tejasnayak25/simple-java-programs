package day5;

public class NameRecursion {
    public static void main(String[] args) {
        printName(0);
    }

    public static void printName(int n) {
        if(n == 10) {
            return;
        } else {
            System.out.println("Tejas");
            printName(++n);
        }
    }
}
