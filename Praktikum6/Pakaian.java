package Tugas;

public class Pakaian extends Produk {
    
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon 25% untuk pakaian
        return harga * 0.25;
    }
}

