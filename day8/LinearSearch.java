package day8;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int p = 0, index = 0, target = 4;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                p = 1;
                index = i;
                break;
            }
        }
        if(p==1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found");
        }
    }
}
