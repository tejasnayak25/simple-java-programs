package Problems;

public class CountDigits {
    public static void main(String[] args) {
        int num = 1234;
        int count = 0;
        int rem = 0;

        while (num > 0) {
            rem += num % 10;
            count++;
            num /= 10;
        }

        System.out.println(count);
    }
}
