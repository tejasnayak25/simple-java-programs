package tasks;

public class Program5b {
    public static void main(String[] args) {
        int[][] gridValues = {
            {10, 15, 22},
            {33, 44, 55},
            {60, 71, 80}
        };
        System.out.println("Odd Numbers (2D):");
        for (int[] row : gridValues) {
            for (int num : row) {
                if (num % 2 != 0) {
                    System.out.println(num);
                }
            }
        }
    }
}
