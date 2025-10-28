package tasks;

public class Program10b {
    public static void main(String[] args) {
        int[][] gridCollection = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int targetValue = 50;
        boolean isFound = false;
        searchLoop:
        for (int[] row : gridCollection) {
            for (int item : row) {
                if (item == targetValue) {
                    isFound = true;
                    break searchLoop;
                }
            }
        }
        if (isFound)
            System.out.println(targetValue + " was found in the 2D collection.");
        else
            System.out.println(targetValue + " was not found in the 2D collection.");
    }
}
