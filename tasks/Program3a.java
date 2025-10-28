package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Program3a {
    public static void main(String[] args) {
        Integer[] sourceArray = {10, 20, 30, 40, 50};
        ArrayList<Integer> targetList = new ArrayList<>(Arrays.asList(sourceArray));
        System.out.println("1D Array to ArrayList Conversion:");
        System.out.println(targetList);
    }
}
