package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Program3b {
    public static void main(String[] args) {
        Integer[][] source2DArray = {
            {10, 20},
            {30, 40},
            {50, 60}
        };
        ArrayList<ArrayList<Integer>> target2DList = new ArrayList<>();
        for (Integer[] innerArray : source2DArray) {
            target2DList.add(new ArrayList<>(Arrays.asList(innerArray)));
        }
        System.out.println("2D Array to ArrayList Conversion:");
        System.out.println(target2DList);
    }
}
