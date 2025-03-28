public class Pattern {
    public static void main(String[] args) {
        int n=5;
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            System.out.print(ch + " ");
            if(i < n/2) {
                ch++;
            } else {
                ch--;
            }
        }
        System.out.println();
        int k=1;
        for(int j=0;j<n;j++) {
            System.out.print(k + " ");

            if(j < n/2) {
                k++;
            } else {
                k--;
            }
        }
    }
}
