package assignments;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {
        if(n==0) return 1;
        else return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int fact = factorial(num);

        System.out.println("Factorial of " + num + ": " + fact);

        sc.close();
    }
}
