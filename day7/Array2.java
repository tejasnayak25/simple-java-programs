package day7;

import java.util.*;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + " index: ");
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
