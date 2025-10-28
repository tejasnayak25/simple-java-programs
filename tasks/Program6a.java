package tasks;

public class Program6a {
    public static void main(String[] args) {
        int[] numList = {10, 15, 22, 33, 44, 55, 60};
        int totalEven = 0;
        int totalOdd = 0;
        for (int num : numList) {
            if (num % 2 == 0)
                totalEven++;
            else
                totalOdd++;
        }
        System.out.println("1D Array Analysis:");
        System.out.println("Count of Even: " + totalEven);
        System.out.println("Count of Odd: " + totalOdd);
    }
}
