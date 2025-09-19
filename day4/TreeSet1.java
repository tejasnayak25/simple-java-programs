package day4;

import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(2);
        s.add(10);
        s.add(-1);
        s.add(20);
        s.add(20);
        System.out.println(s);
    }
}
