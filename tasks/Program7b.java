package tasks;

public class Program7b {
    public static void main(String[] args) {
        int[][] matrixElements = {
            {10, 20},
            {30, 40},
            {50, 60}
        };
        int totalSum = 0;
        for (int[] row : matrixElements) {
            for (int val : row) {
                totalSum += val;
            }
        }
        System.out.println("2D Array Sum: " + totalSum);
    }
}
