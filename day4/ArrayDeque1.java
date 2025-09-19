package day4;
import java.util.*;

public class ArrayDeque1 {
    public static void main(String[] args) {
        Queue<Integer> s = new ArrayDeque<>();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println(s);
        System.out.println(s.peek());
        s.remove();
        System.out.println(s);
        System.out.println(s.peek());
    }
}
