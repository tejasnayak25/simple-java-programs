package assignments;

import java.util.Scanner;

public class BinaryToOctal {

    static int getDecimal(int n) {
        int dec = 0;
        int count = 1;
        while(n > 0) {
            dec = (n%10)*count + dec;
            count *= 2;
            n=n/10;
        }

        return dec;
    }

    static int getOctal(int n) {
        n = getDecimal(n);
        int oct = 0;
        int count = 1;
        while(n > 0) {
            oct = (n % 8) * count + oct;
            n /= 8;
            count *= 10;
        }

        return oct;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int binary = getOctal(num);

        System.out.println("Binary: " + num + ", Octal: " + binary);

        sc.close();
    }
}
