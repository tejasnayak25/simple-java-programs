package strings_day1;

public class StringBuilder1 {
    public static void main(String[] args) {
        String sentence = "This is a sentence";
        StringBuilder sb = new StringBuilder();

        String[] words = sentence.split(" ");
        for (int i=0; i<words.length; i++) {
            StringBuilder sb1 = new StringBuilder(words[i]);
            sb.append(sb1.reverse().toString() + " ");
        }

        System.out.println(sb);
    }
}
