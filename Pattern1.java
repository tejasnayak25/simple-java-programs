public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print("* ");
        }
        
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print((char)('a' + i) + " ");
        }

        System.out.println();

        int i = 1;

        for(int j=0;j<5;j++) {
            System.out.print(i + " ");
            if(j >= (5/2)) i--;
            else i++;
        }

        System.out.println();

        char ch = 'a';

        for(int j=0;j<5;j++) {
            System.out.print(ch + " ");
            if(j >= (5/2)) ch--;
            else ch++;
        }

        System.out.println();

        for (int j = 0; j < 5; j++) {
            for (int j2 = 0; j2 < 5; j2++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int j = 0; j < 5; j++) {
            for (int j2 = 0; j2 < 5; j2++) {
                System.out.print("(" + j + "," +  j2 + ")" + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int j = 1; j <= 5; j++) {
            for (int j2 = 1; j2 <= 5; j2++) {
                System.out.print(j2 + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int j = 1; j <= 5; j++) {
            for (int j2 = 1; j2 <= 5; j2++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
