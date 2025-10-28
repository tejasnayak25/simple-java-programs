package tasks;

public class Program8c {
    public static void main(String[] args) {
        int[][][] tensorData = {
            {
                {10, 15, 22},
                {33, 44, 55}
            },
            {
                {60, 71, 80},
                {90, 101, 120}
            }
        };
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for (int[][] matrix : tensorData) {
            for (int[] row : matrix) {
                for (int num : row) {
                    if (num % 2 == 0)
                        sumOfEvens += num;
                    else
                        sumOfOdds += num;
                }
            }
        }
        System.out.println("3D Array Sums:");
        System.out.println("Even Sum: " + sumOfEvens);
        System.out.println("Odd Sum: " + sumOfOdds);
    }
}
