package tasks;

public class Program9a {
    public static void main(String[] args) {
        int[] items = {10, 20, 30, 40, 50};
        int elementToSkip = 30;
        System.out.println("1D Array (Skipping " + elementToSkip + "):");
        for (int item : items) {
            if (item == elementToSkip)
                continue;
            System.out.println(item);
        }
    }
}
