package tasks;

public class Program4b {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 15, 22},
            {33, 44, 55},
            {60, 71, 80}
        };
        System.out.println("Even Numbers (2D):");
        for (int[] row : matrix) {
            for (int value : row) {
                if (value % 2 == 0) {
                    System.out.println(value);
                }
            }
        }
    }
}
