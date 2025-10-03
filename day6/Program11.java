package day6;

public class Program11 {
    public static void main(String[] args) {
        int num = 121;
        int n = num;
        int x = 0;
        while (num > 0) {
            x = x * 10 + num % 10;
            num = num / 10;
        }
        if(n==x) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
