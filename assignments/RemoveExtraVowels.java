package assignments;

import java.util.Scanner;

public class RemoveExtraVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";
        int i = 0;

        while (i < str.length()) {
            char ch = str.charAt(i);

            if (isVowel(ch)) {
                result += ch;
                i++;

                while (i < str.length() && isVowel(str.charAt(i))) {
                    i++;
                }
            } else {
                result += ch;
                i++;
            }
        }

        System.out.println("After removing extra continuous vowels: " + result);
        sc.close();
    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
