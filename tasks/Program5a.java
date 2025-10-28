package tasks;

public class Program5a {
    public static void main(String[] args) {
        int[] values = {10, 15, 22, 33, 44, 55, 60};
        System.out.println("Odd Numbers (1D):");
        for (int num : values) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
