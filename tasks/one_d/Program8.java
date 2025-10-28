package tasks.one_d;

public class Program8 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum_e = 0, sum_o = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum_e += arr[i];
            } else {
                sum_o += arr[i];
            }
        }

        System.out.println("Sum of Even: " + sum_e);
        System.out.println("Sum of Odd: " + sum_o);
    }
}
