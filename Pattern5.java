public class Pattern5 {
    public static void main(String[] args) {
        char sym = '*';
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sym = '*';

                if(!(i == 0 || i == n-1) && j != n/2) {
                    sym = ' ';
                }

                System.out.print(sym + " ");
            }
            System.out.println();
        }
    }
}
