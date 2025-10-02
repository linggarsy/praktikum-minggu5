interface HewanPeliharaan {
    void bermain();
}

class Kucing implements HewanPeliharaan {
    @Override
    public void bermain() {
        System.out.println("Kucing bermain bola kecil");
    }
}

class Anjing implements HewanPeliharaan {
    @Override
    public void bermain() {
        System.out.println("Anjing bermain frisbee");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        HewanPeliharaan h1 = new Kucing();
        HewanPeliharaan h2 = new Anjing();

        h1.bermain();
        h2.bermain();
    }
}
