package Tugas;

import java.util.List;
import java.util.ArrayList;

public class KeranjangBelanja {

    private List<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    public double hitungTotalSetelahDiskon() {
        double total = 0;
        for (Produk p : daftarProduk) {
            double diskon = p.hitungDiskon();
            total += (p.getHarga() - diskon);
        }
        return total;
    }

    public void tampilkanIsiKeranjang() {

        System.out.println("=====================================================================================");
        System.out.printf("| %-20s | %-15s | %-15s | %-20s |%n",
                "Nama Produk", "Harga", "Diskon", "Harga Setelah Diskon");
        System.out.println("=====================================================================================");

        for (Produk p : daftarProduk) {
            System.out.printf("| %-20s | %15.2f | %15.2f | %20.2f |%n",
                    p.getNama(), p.getHarga(), p.hitungDiskon(), (p.getHarga() - p.hitungDiskon()));
        }

        System.out.println("=====================================================================================");
        System.out.printf("| %-54s | %20.2f |%n ", "Total harga setelah diskon", hitungTotalSetelahDiskon());
        System.out.println("=====================================================================================");
    }

}
