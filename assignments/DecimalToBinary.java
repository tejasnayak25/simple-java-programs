package assignments;

import java.util.Scanner;

public class DecimalToBinary {

    static int getBinary(int n) {
        int bin = 0;
        int count = 1;
        while(n > 0) {
            bin = (n%2)*count + bin;
            count *= 10;
            n=n/2;
        }

        return bin;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int binary = getBinary(num);

        System.out.println("Decimal: " + num + ", Binary: " + binary);

        sc.close();
    }
}
