package tasks;

public class Program11b {
    public static void main(String[] args) {
        int[][] matrixCandidates = {
            {2, 4, 5},
            {6, 7, 8},
            {9, 10, 11}
        };
        System.out.println("Prime Numbers in 2D Matrix:");
        for (int[] row : matrixCandidates) {
            for (int candidate : row) {
                if (checkPrime(candidate)) {
                    System.out.println(candidate);
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
