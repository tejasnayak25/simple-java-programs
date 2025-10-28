package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Program3c {
    public static void main(String[] args) {
        Integer[][][] source3DArray = {
            {
                {10, 20},
                {30, 40}
            },
            {
                {50, 60},
                {70, 80}
            }
        };
        ArrayList<ArrayList<ArrayList<Integer>>> target3DList = new ArrayList<>();
        for (Integer[][] twoDArray : source3DArray) {
            ArrayList<ArrayList<Integer>> inner2DList = new ArrayList<>();
            for (Integer[] oneDArray : twoDArray) {
                inner2DList.add(new ArrayList<>(Arrays.asList(oneDArray)));
            }
            target3DList.add(inner2DList);
        }
        System.out.println("3D Array to ArrayList Conversion:");
        System.out.println(target3DList);
    }
}
