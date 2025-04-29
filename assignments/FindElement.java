package assignments;

public class FindElement {
    public static void main(String[] args) {
        int a[] = { 1,2,3,2,5,1,3,2,6 };
        int key = 5;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if(a[i] == key) {
                found = true;
            }
        }

        if(found) {
            System.out.println("The key element exists in the array");
        } else {
            System.out.println("The key element doesn't exist in the array");
        }
    }
}
