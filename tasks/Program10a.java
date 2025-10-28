package tasks;

public class Program10a {
    public static void main(String[] args) {
        int[] collection = {10, 20, 30, 40, 50};
        int targetValue = 30;
        boolean isFound = false;
        for (int item : collection) {
            if (item == targetValue) {
                isFound = true;
                break;
            }
        }
        if (isFound)
            System.out.println(targetValue + " was found in the 1D collection.");
        else
            System.out.println(targetValue + " was not found in the 1D collection.");
    }
}
