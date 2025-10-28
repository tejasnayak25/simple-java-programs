package tasks;

public class Program11a {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("Prime Numbers in 1D List:");
        for (int candidate : candidates) {
            if (checkPrime(candidate)) {
                System.out.println(candidate);
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
