package tasks;

public class Program10c {
    public static void main(String[] args) {
        int[][][] cubeCollection = {
            {
                {10, 20, 30},
                {40, 50, 60}
            },
            {
                {70, 80, 90},
                {100, 110, 120}
            }
        };
        int targetValue = 110;
        boolean isFound = false;
        searchLoop:
        for (int[][] matrix : cubeCollection) {
            for (int[] row : matrix) {
                for (int item : row) {
                    if (item == targetValue) {
                        isFound = true;
                        break searchLoop;
                    }
                }
            }
        }
        if (isFound)
            System.out.println(targetValue + " was found in the 3D collection.");
        else
            System.out.println(targetValue + " was not found in the 3D collection.");
    }
}
