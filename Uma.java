public class Uma implements PersonInterface {
    @Override
    public void eat() {
        System.out.println("Uma loves to eat sweets");
    }
    
    public static void main(String[] args) {
        Uma u = new Uma();
        System.out.println(u.age);
        u.eat();
    }
}
