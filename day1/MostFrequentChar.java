package day1;

import java.util.*;

public class MostFrequentChar {
    public static char mostFrequent(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch:str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int mcount = 0;
        char mchar = '\0';
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > mcount) {
                mcount = entry.getValue();
                mchar = entry.getKey();
            }
        }
        return mchar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(mostFrequent(str));
    }
}
