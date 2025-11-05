package day10;

public class SequentialSort {
    public static void main(String[] args) {
        int[] a = { 40, 30, 10, 20 };
        int temp;

        for(int i = 0; i < a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
