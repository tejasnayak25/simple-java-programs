public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;

        char sym = '*';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sym = '*';
                if(!(i==0 || i==n-1)) {
                    if((n - i - 1) != j)
                    sym = ' ';
                }
                System.out.print(sym + " ");
            }
            System.out.println();
        }
    }
}
