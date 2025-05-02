public class Whatsapp_V3 extends Whatsapp_V2 {
    @Override
    void deliveryReport() {
        super.deliveryReport();
        System.out.println("Blue Tick Enabled");
    }
    void status() {
        System.out.println("Status Updation");
    }
}
