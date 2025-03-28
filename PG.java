public class PG {
    public static void main(String[] args) {
        char gender = 'M';
        int age = 21;

        if(gender == 'M' || gender == 'm') {
            if(age > 18) {
                System.out.println("Eligible Bachelor");
            } else {
                System.out.println("Not Eligible Bachelor");
            }
        } else if(gender == 'F' || gender == 'f') {
            if(age > 18) {
                System.out.println("Eligible Spinster");
            } else {
                System.out.println("Not Eligible Spinster");
            }
        } else {
            
        }
    }
}
