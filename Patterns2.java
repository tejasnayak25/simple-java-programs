public class Patterns2 {
    public static void main(String[] args) {
        char sym = '*';
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sym = '*';

                if(!(i==0 || i==2 || i==4) && !(j==0 || j==4)) {
                    sym = ' ';
                }

                System.out.print(sym + " ");
            }
            System.out.println();
        }
    }
}
