// print the elements in an array
public class Array3 {
    public static void main(String[] args) {
        int[] arr = {11,12,13,14,15};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
