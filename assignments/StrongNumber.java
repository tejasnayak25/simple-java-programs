package assignments;

import java.util.Scanner;

public class StrongNumber {

    static int factorial(int n) {
        if(n==0) return 1;
        else return n*factorial(n-1);
    }

    static boolean checkStrong(int n) {
        int sum = 0;
        int num = n;
        while(n > 0) {
            sum += factorial(n % 10);
            n /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        boolean strong = checkStrong(num);

        if(strong)
            System.out.println("Strong number");
        else System.out.println("Not a strong number");

        sc.close();
    }
}
