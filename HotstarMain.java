public class HotstarMain {
    public static void main(String[] args) {
        HotstarFree hf = new HotstarFree();
        hf.login();
        hf.watch();
        HotstarPrime hp = new HotstarPrime();
        hp.login();
        hp.watch();
        HotstarVIP hv = new HotstarVIP();
        hv.login();
        hv.watch();
    }
}
