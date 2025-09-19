package day4;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(2);
        s.add(10);
        s.add(-1);
        s.add(20);
        s.add(20);
        System.out.println(s);
    }
}
