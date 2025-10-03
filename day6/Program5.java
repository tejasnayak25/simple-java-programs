package day6;

public class Program5 {
    public static void main(String[] args) {
        call(10, 1);
    }
    public static void call(int s, int e) {
        if(s==e-1) return;
        else {
            if(s%2!=0)
                System.out.println(s);
            call(s-1, e);
        }
    }
}
