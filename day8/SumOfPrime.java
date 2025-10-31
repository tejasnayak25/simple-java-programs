package day8;

public class SumOfPrime {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        int p = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            p = 0;
            for (int j = 1; j <= arr[i]; j++) {
                if(arr[i] % j == 0)
                    p++;
            }
            if(p == 2) 
                sum += arr[i];
        }

        System.out.println("Sum of Prime: "  + sum);

        p = 0;
        for (int j = 1; j <= sum; j++) {
            if(sum % j == 0)
                p++;
        }
        if(p == 2) 
            System.out.println("Sum is prime");
        else
            System.out.println("Sum is not prime");
    }
}
