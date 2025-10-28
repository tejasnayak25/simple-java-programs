package tasks;

public class Program4a {
    public static void main(String[] args) {
        int[] data = {10, 15, 22, 33, 44, 55, 60};
        System.out.println("Even Numbers (1D):");
        for (int value : data) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
    }
}
