package day6;

public class Program1 {
    public static void main(String[] args) {
        call(1,10);
    }

    public static void call(int s, int e) {
        if(s==e+1)
            return;
        else
        {
            System.out.println(s);
            call(s+1, e);
        }
    }
}
