abstract class Kendaraan {
    abstract void bergerak();

    void info() {
        System.out.println("Ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan {
    @Override
    void bergerak() {
        System.out.println("Mobil berjalan di jalan raya");
    }
}

class Kapal extends Kendaraan {
    @Override
    void bergerak() {
        System.out.println("Kapal berlayar di laut");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Kendaraan k1 = new Mobil();
        Kendaraan k2 = new Kapal();

        k1.info();
        k1.bergerak();

        k2.info();
        k2.bergerak();
    }
}
