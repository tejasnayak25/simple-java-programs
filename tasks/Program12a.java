package tasks;

public class Program12a {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int count = 0;
        
        for (int element : myArray) {
            count++;
        }
        
        System.out.println("Calculated 1D Array Size: " + count);
    }
}
