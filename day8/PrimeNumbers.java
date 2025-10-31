package day8;

public class PrimeNumbers {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            p = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if(arr[i] % j == 0)
                    p++;
            }
            if(p == 2) 
                System.out.println(arr[i]);
        }
    }
}
