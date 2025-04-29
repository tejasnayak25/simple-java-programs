package assignments;

public class ArrayOccurence {
    public static void main(String[] args) {
        int a[] = { 1,2,3,2,5,1,3,2,6 };
        int key = 2;

        System.out.print("The element " + key + " occurs in the following positions: ");

        for (int i = 0; i < a.length; i++) {
            if(a[i] == key) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}
