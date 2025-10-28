package tasks;

public class Program8b {
    public static void main(String[] args) {
        int[][] matrixData = {
            {10, 15, 22},
            {33, 44, 55},
            {60, 71, 80}
        };
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for (int[] row : matrixData) {
            for (int num : row) {
                if (num % 2 == 0)
                    sumOfEvens += num;
                else
                    sumOfOdds += num;
            }
        }
        System.out.println("2D Array Sums:");
        System.out.println("Even Sum: " + sumOfEvens);
        System.out.println("Odd Sum: " + sumOfOdds);
    }
}
