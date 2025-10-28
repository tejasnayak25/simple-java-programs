package tasks;

public class Program8a {
    public static void main(String[] args) {
        int[] dataSet = {10, 15, 22, 33, 44, 55, 60};
        int sumOfEvens = 0;
        int sumOfOdds = 0;
        for (int num : dataSet) {
            if (num % 2 == 0)
                sumOfEvens += num;
            else
                sumOfOdds += num;
        }
        System.out.println("1D Array Sums:");
        System.out.println("Even Sum: " + sumOfEvens);
        System.out.println("Odd Sum: " + sumOfOdds);
    }
}
