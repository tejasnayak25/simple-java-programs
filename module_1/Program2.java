package module_1;

class Alpha {
    void disp() {
        System.out.println("Executing disp()...");
    }
}

class Beta extends Alpha {
    void print() {
        System.out.println("Executing print()...");
    }
}

class Gamma extends Beta {
    void exe() {
        System.out.println("Executing exe()...");
    }
}

public class Program2 {
    public static void main(String[] args) {
        Gamma g = new Gamma();
        g.disp();
        g.print();
        g.exe();

        Alpha a = g;
        a.disp();
    }
}
