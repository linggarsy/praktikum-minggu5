class Hewan {
    void suara() {
        System.out.println("Hewan bersuara...");
    }
}

class Kucing extends Hewan {
    @Override
    void suara() {
        System.out.println("Meong...");
    }
}

class Anjing extends Hewan {
    @Override
    void suara() {
        System.out.println("Guk guk...");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Hewan h1 = new Kucing(); // polymorphic reference
        Hewan h2 = new Anjing();

        h1.suara(); // Meong...
        h2.suara(); // Guk guk...
    }
}
