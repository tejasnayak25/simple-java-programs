package Problems;

public class ReverseDigits {
    public static void main(String[] args) {
        int num = 12345;
        int res = 0;

        while(num > 0) {
            res *= 10;
            res += num % 10;
            num /= 10;
        }

        System.out.println(res);
    }
}
