package day4;
import java.util.*;

public class LinkedListQueue1 {
    public static void main(String[] args) {
        Queue<Integer> s = new LinkedList<>();
        s.add(5);
        s.add(3);
        s.add(6);
        s.add(2);
        s.add(1);
        s.add(4);
        System.out.println(s);
        System.out.println(s.peek());
        s.remove();
        System.out.println(s);
        System.out.println(s.peek());
    }
}
