package tasks;

public class Program7a {
    public static void main(String[] args) {
        int[] elements = {10, 20, 30, 40, 50};
        int totalSum = 0;
        for (int val : elements) {
            totalSum += val;
        }
        System.out.println("1D Array Sum: " + totalSum);
    }
}
