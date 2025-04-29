package assignments;

public class SecondMax {
    public static void main(String[] args) {
        int a[] = { 1,2,3,2,5,1,3,2,6 };
        int m = 0, sm = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] > m) {
                sm = m;
                m = a[i];
            }
        }

        System.out.println("Second Maximum element is: " + sm);
    }
}
