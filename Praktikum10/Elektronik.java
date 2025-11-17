package Tugas;

public class Elektronik implements Pembayaran {

    @Override
    public double hitungPajak(double harga) {
        return harga * 0.10; // 10%
    }
}
