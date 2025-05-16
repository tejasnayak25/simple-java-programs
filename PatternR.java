public class PatternR {
    public static void main(String[] args) {
        char sym = '*';
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sym = '*';

                if(i<=n/2) {
                    if(!(i==0 || i==2) && !(j==0 || j==n-1)) {
                        sym = ' ';
                    }
                } else {
                    if(j != 0) {
                        if((i - n/2) != (j - 1)) {
                            sym = ' ';
                        }
                    }
                }

                System.out.print(sym + " ");
            }
            System.out.println();
        }
    }
}
