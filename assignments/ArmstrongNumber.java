package assignments;

import java.util.Scanner;

public class ArmstrongNumber {
    static boolean checkArmstrong(int n) {
        int sum = 0;
        int num = n;

        while(n > 0) {
            sum += Math.pow(n % 10, 3);
            n /= 10;
        }

        return sum == num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        boolean strong = checkArmstrong(num);

        if(strong)
            System.out.println("Armstrong number");
        else System.out.println("Not an armstrong number");

        sc.close();
    }
}
