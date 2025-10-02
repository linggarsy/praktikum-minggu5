class Kalkulator {
    // method overloading
    int tambah(int a, int b) {
        return a + b;
    }

    double tambah(double a, double b) {
        return a + b;
    }

    int tambah(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();
        System.out.println("Tambah int: " + k.tambah(5, 10));
        System.out.println("Tambah double: " + k.tambah(3.5, 2.5));
        System.out.println("Tambah 3 int: " + k.tambah(1, 2, 3));
    }
}