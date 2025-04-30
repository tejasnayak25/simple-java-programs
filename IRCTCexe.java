public class IRCTCexe {
    public static void main(String[] args) {
        IRCTC i = new IRCTC();
        i.search(22663);
        i.search(456327384897L);
        i.search("Chennai", "Pune");
    }
}
