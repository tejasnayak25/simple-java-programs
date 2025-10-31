package day8;

public class SkipNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 4) 
                continue;
            System.out.println(arr[i]);
        }
    }
}
