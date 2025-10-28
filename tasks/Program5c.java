package tasks;

public class Program5c {
    public static void main(String[] args) {
        int[][][] cubeValues = {
            {
                {10, 15, 22},
                {33, 44, 55}
            },
            {
                {60, 71, 80},
                {90, 101, 120}
            }
        };
        System.out.println("Odd Numbers (3D):");
        for (int[][] matrix : cubeValues) {
            for (int[] row : matrix) {
                for (int num : row) {
                    if (num % 2 != 0) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}
