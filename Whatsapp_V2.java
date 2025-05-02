public class Whatsapp_V2 extends Whatsapp_V1 {
    @Override
    void deliveryReport() {
        super.deliveryReport();
        System.out.println("Double Tick Enabled");
    }
    void calling() {
        System.out.println("Voice/Video Calling");
    }
}
