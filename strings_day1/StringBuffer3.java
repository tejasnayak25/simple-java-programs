package strings_day1;

import java.util.Scanner;

public class StringBuffer3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        StringBuffer sb = new StringBuffer(str);
        if(str.equalsIgnoreCase(sb.reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        in.close();
    }
}
