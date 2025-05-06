package assignments;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        String str = "hello";
        char[] charArray = str.toCharArray();

        System.out.println(Arrays.toString(charArray));
    }
}
