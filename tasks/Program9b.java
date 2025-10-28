package tasks;

public class Program9b {
    public static void main(String[] args) {
        int[][] gridItems = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        int elementToSkip = 50;
        System.out.println("2D Array (Skipping " + elementToSkip + "):");
        for (int[] row : gridItems) {
            for (int item : row) {
                if (item == elementToSkip)
                    continue;
                System.out.println(item);
            }
        }
    }
}
