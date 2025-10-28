package tasks;

public class Program6b {
    public static void main(String[] args) {
        int[][] numMatrix = {
            {10, 15, 22},
            {33, 44, 55},
            {60, 71, 80}
        };
        int totalEven = 0;
        int totalOdd = 0;
        for (int[] row : numMatrix) {
            for (int num : row) {
                if (num % 2 == 0)
                    totalEven++;
                else
                    totalOdd++;
            }
        }
        System.out.println("2D Array Analysis:");
        System.out.println("Count of Even: " + totalEven);
        System.out.println("Count of Odd: " + totalOdd);
    }
}
