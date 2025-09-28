package Tugas;

public class Elektronik extends Produk {

    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon 15% untuk elektronik
        return harga * 0.15;
    }
}
