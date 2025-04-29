package assignments;

public class SecondMin {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 2, 5, 1, 3, 2, 6 };
        int min = 999;
        int secondMin = 999;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (a[i] > min && a[i] < secondMin) {
                secondMin = a[i];
            }
        }

        System.out.println("Second Minimum element is: " + secondMin);
    }
}