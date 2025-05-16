public class PatternName {
    public static void main(String[] args) {
        char sym;
        char pat = '@';
        int n = 5;

        char[][][] name = new char[5][5][6];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sym = pat;
                if(i != 0 && j != n/2) {
                    sym = ' ';
                }

                name[0][i][j] = sym;
            }
            name[0][i][5] = ' ';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sym = pat;
                if(!(i == 0 || i == n/2 || i == n-1) && j != 0) {
                    sym = ' ';
                }

                name[1][i][j] = sym;
            }
            name[1][i][5] = ' ';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sym = pat;
                if(i != 0) {
                    if(j != n-2 && (!(i == n-1 || i == n-2) || j!=0)) {
                        sym = ' ';
                    }
                    if((i == n-1 && j < n-1)) {
                        sym = pat;
                    }
                }

                name[2][i][j] = sym;
            }
            name[2][i][5] = ' ';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sym = pat;

                if(!(i == 0 || i == n/2) && !(j == 0 || j == n-1)) {
                    sym = ' ';
                }

                name[3][i][j] = sym;
            }
            name[3][i][5] = ' ';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sym = pat;

                if(!(i == 0 || i == n-1 || i == n/2)) {
                    if(i < n/2) {
                        if(j!=0) sym = ' ';
                    } else if(i > n/2) {
                        if(j!=n-1) sym = ' ';
                    }
                }

                name[4][i][j] = sym;
            }
            name[4][i][5] = ' ';
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6*n; j++) {
                System.out.print(name[j/6][i][j%6] + " ");
            }
            System.out.println();
        }
    }
}
