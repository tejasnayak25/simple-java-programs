package module_1;

// Up-casting

class Father {
    int x=10;
}

class  Son extends Father {
    int y=20;
}

public class Program1 {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);
    }
}