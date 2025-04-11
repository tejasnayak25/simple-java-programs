// automorphic means number should be the one's digit of its square
package Problems;

public class Automorphic {
    public static void main(String[] args) {
        int num = 25;
        int sq = num * num;
        int res = 10;
        while(num / res > 0) res *= 10;

        if(sq % res == num) System.out.println("Automorphic number");
        else System.out.println("Not an Automorphic number");
    }
}
