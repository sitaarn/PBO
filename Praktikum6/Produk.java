package Tugas;

import java.util.ArrayList;
import java.util.List;

abstract class Produk {

    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
    
    // Method abstrak untuk menghitung diskon
    public abstract double hitungDiskon();
}

