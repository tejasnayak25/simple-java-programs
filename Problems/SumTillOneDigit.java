package Problems;

public class SumTillOneDigit {
    public static void main(String[] args) {
        int num = 1543;
        int sum = 0;
        while(num > 9) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}
