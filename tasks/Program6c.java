package tasks;

public class Program6c {
    public static void main(String[] args) {
        int[][][] numTensor = {
            {
                {10, 15, 22},
                {33, 44, 55}
            },
            {
                {60, 71, 80},
                {90, 101, 120}
            }
        };
        int totalEven = 0;
        int totalOdd = 0;
        for (int[][] matrix : numTensor) {
            for (int[] row : matrix) {
                for (int num : row) {
                    if (num % 2 == 0)
                        totalEven++;
                    else
                        totalOdd++;
                }
            }
        }
        System.out.println("3D Array Analysis:");
        System.out.println("Count of Even: " + totalEven);
        System.out.println("Count of Odd: " + totalOdd);
    }
}
