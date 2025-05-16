public class PatternW {
    public static void main(String[] args) {
        char sym = '*';
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sym = '*';

                if(!(j ==0 || j == n-1)) {
                    if(i < n/2) {
                        sym = ' ';
                    } else {
                        if(i == n/2 && j != n/2) sym = ' ';
                        if(i == n-2 && j % 2 == 0) sym = ' ';
                        if(i == n-1) sym = ' ';
                    }
                }

                System.out.print(sym + " ");
            }
            System.out.println();
        }
    }
}
