package tasks;

public class Program11c {
    public static void main(String[] args) {
        int[][][] tensorCandidates = {
            {
                {2, 3, 4},
                {5, 6, 7}
            },
            {
                {8, 9, 10},
                {11, 12, 13}
            }
        };
        System.out.println("Prime Numbers in 3D Tensor:");
        for (int[][] matrix : tensorCandidates) {
            for (int[] row : matrix) {
                for (int candidate : row) {
                    if (checkPrime(candidate)) {
                        System.out.println(candidate);
                    }
                }
            }
        }
    }

    static boolean checkPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
