package tasks;

public class Program9c {
    public static void main(String[] args) {
        int[][][] cubeItems = {
            {
                {10, 20, 30},
                {40, 50, 60}
            },
            {
                {70, 80, 90},
                {100, 110, 120}
            }
        };
        int elementToSkip = 80;
        System.out.println("3D Array (Skipping " + elementToSkip + "):");
        for (int[][] matrix : cubeItems) {
            for (int[] row : matrix) {
                for (int item : row) {
                    if (item == elementToSkip)
                        continue;
                    System.out.println(item);
                }
            }
        }
    }
}
