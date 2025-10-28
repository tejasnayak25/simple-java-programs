package tasks.one_d;

import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5 };
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            l.add(arr[i]);
        }
        System.out.println(l);
    }
}
