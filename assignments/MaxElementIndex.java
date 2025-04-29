package assignments;

public class MaxElementIndex {
    public static void main(String[] args) {
        int a[] = { 1,2,3,2,5,1,3,2,6 };
        int m = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] > a[m]) {
                m = i;
            }
        }

        System.out.println("The index of Maximum element is: " + m);
    }
}
