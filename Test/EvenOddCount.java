package Test;

public class EvenOddCount {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5};
        int even_count = 0;
        int odd_count = 0;
        for(int i=0;i<n.length;i++) {
            if(n[i] % 2 == 0) 
                even_count++;
            else 
                odd_count ++;
        }
        System.out.println("Even: " + even_count);
        System.out.println("Odd: " + odd_count);
    }
}
