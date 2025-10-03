package day6;

public class Program2 {
    public static void main(String[] args) {
        call(10,1);
    }

    public static void call(int s, int e) {
        if(s==e-1)
            return;
        else
        {
            System.out.println(s);
            call(s-1, e);
        }
    }
}
