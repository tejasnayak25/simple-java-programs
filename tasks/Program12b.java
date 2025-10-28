package tasks;

public class Program12b {
    public static void main(String[] args) {
        int[][] myMatrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        
        int rowCount = 0;
        int colCount = 0;
        boolean isFirstRow = true;

        for (int[] row : myMatrix) {
            rowCount++;
            if (isFirstRow) {
                for (int element : row) {
                    colCount++;
                }
                isFirstRow = false; // Only count columns for the first row
            }
        }
        
        System.out.println("Row count: " + rowCount);
        System.out.println("Column count: " + colCount);
        System.out.println("Total element count: " + (rowCount * colCount));
    }
}
