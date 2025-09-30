package Responsi_UTS;

public class Main {

    public static void main(String[] args) {
        // Objek Produk
        Produk p1 = new Elektronik("Laptop", 7000000, 2);
        Produk p2 = new Makanan("Snack", 8000, "2027-01-05");
        Produk p3 = new Elektronik("TV", 5000000, 3);
        Produk p4 = new Makanan("Telur", 25000, "2025-09-21");

        // Objek Pegawai
        Pegawai peg1 = new PegawaiTetap("Sita", 8000000, 1080000);
        Pegawai peg2 = new PegawaiKontrak("Rika", 3000000, 11);
        Pegawai peg3 = new PegawaiTetap("Bima", 9500000, 1500000);
        Pegawai peg4 = new PegawaiTetap("Putra", 7000000, 2000000);
        Pegawai peg5 = new PegawaiKontrak("Erin", 3500000, 6);

        // Output Produk
        System.out.println("===== Output Produk =====");
        p1.tampilkanInfo();
        System.out.println();
        p2.tampilkanInfo();
        System.out.println();
        p3.tampilkanInfo();
        System.out.println();
        p4.tampilkanInfo();

        // Output Pegawai
        System.out.println("\n===== Output Pegawai =====");
        peg1.tampilkanInfo();
        System.out.println();
        peg2.tampilkanInfo();
        System.out.println();
        peg3.tampilkanInfo();
        System.out.println();
        peg4.tampilkanInfo();
        System.out.println();
        peg5.tampilkanInfo();
    }
}
