package assignments;

import java.util.Scanner;

public class OctalToHexaSimple {
    static int getDecimal(int octal) {
        int decimal = 0, base = 1;
        while (octal > 0) {
            int digit = octal % 10;
            decimal += digit * base;
            base *= 8;
            octal /= 10;
        }
        return decimal;
    }

    static String getHexa(int octal) {
        int decimal = getDecimal(octal);
        String hex = "";

        while (decimal > 0) {
            int rem = decimal % 16;
            char hexChar;

            if (rem < 10) {
                hexChar = (char) ('0' + rem);
            } else {
                hexChar = (char) ('A' + (rem - 10));
            }

            hex = hexChar + hex;
            decimal /= 16;
        }

        return hex.equals("") ? "0" : hex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Octal number: ");
        int octal = sc.nextInt();

        String hexa = getHexa(octal);
        System.out.println("Octal: " + octal + ", Hexadecimal: " + hexa);

        sc.close();
    }
}
