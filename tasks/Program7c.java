package tasks;

public class Program7c {
    public static void main(String[] args) {
        int[][][] tensorElements = {
            {
                {10, 20},
                {30, 40}
            },
            {
                {50, 60},
                {70, 80}
            }
        };
        int totalSum = 0;
        for (int[][] matrix : tensorElements) {
            for (int[] row : matrix) {
                for (int val : row) {
                    totalSum += val;
                }
            }
        }
        System.out.println("3D Array Sum: " + totalSum);
    }
}
