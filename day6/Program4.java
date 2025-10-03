package day6;

public class Program4 {
    public static void main(String[] args) {
        call(1, 10);
    }
    public static void call(int s, int e) {
        if(s==e+1) return;
        else {
            if(s%2!=0)
                System.out.println(s);
            call(s+1, e);
        }
    }
}
