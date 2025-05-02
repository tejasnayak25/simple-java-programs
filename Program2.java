class Card {
    void swipe() {
        System.out.println("Loading");
    }
}

class CreditCard extends Card {
    @Override
    void swipe() {
        System.out.println("Due Increases");
    }
}

class DebitCard extends Card {
    @Override
    void swipe() {
        System.out.println("Balance Decreases");
    }
}

public class Program2 {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard();
        cc.swipe();
        DebitCard dc = new DebitCard();
        dc.swipe();
    }
}