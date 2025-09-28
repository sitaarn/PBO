package Tugas;

public class MainProduk {

    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Pemrograman Java", 127000);
        Produk elektronik = new Elektronik("Komputer", 8000000);
        Produk pakaian = new Pakaian("Kaos", 382000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanIsiKeranjang();
        System.out.println("\nTotal harga setelah diskon: " + keranjang.hitungTotalSetelahDiskon());
    }
}

