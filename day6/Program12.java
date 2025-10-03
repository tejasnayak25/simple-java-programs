package day6;

public class Program12 {
    public static void main(String[] args) {
        int num = 123;
        int x = rev(num, 0);
        if(num==x) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static int rev(int num, int x) {
        if(num <= 0) return x;
        else {
            x = x * 10 + num % 10;
            return rev(num / 10, x);
        }
    }
}
