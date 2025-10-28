package tasks;

public class Program4c {
    public static void main(String[] args) {
        int[][][] tensor = {
            {
                {10, 15, 22},
                {33, 44, 55}
            },
            {
                {60, 71, 80},
                {90, 101, 120}
            }
        };
        System.out.println("Even Numbers (3D):");
        for (int[][] matrix : tensor) {
            for (int[] row : matrix) {
                for (int value : row) {
                    if (value % 2 == 0) {
                        System.out.println(value);
                    }
                }
            }
        }
    }
}
