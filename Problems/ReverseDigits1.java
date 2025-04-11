package Problems;

public class ReverseDigits1 {
    public static void main(String[] args) {
        int num = 12345;
        int rem = 0;

        while(num > 0) {
            rem =  num % 10;
            System.out.println(rem);
            num /= 10;
        }
    }
}