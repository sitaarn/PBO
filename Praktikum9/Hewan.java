package praktikum9;

// Kelas abstrak
abstract class Hewan {

    String jenis;

    // Konstruktor
    Hewan(String jenis) {
        this.jenis = jenis;
    }

    // Metode abstrak
    abstract void suara();

    // Metode dengan implementasi
    void info() {
        System.out.println(jenis + " adalah seekor hewan.");
    }

    // Metode tambahan
    void makan() {
        System.out.println(jenis + " sedang makan.");
    }
}
