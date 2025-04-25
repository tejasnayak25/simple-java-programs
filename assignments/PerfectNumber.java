package assignments;

import java.util.Scanner;

public class PerfectNumber {

    static boolean checkPerfect(int n) {
        int sum = 0;
        int num = n;

        for(int i=1;i<n;i++) {
            if(n % i == 0) sum += i;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        boolean perfect = checkPerfect(num);

        if(perfect)
            System.out.println("Perfect number");
        else System.out.println("Not a perfect number");

        sc.close();
    }
}
