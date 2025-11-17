package Tugas;

public class Main {
    public static void main(String[] args) {

        Pembayaran[] elektronik = {
            new Elektronik(), 
            new Elektronik(), 
            new Elektronik()
        };

        double[] hargaElektro = {2500000, 1500000, 500000};
        String[] namaElektro = {"Laptop", "Smartphone", "Headset"};

        Pembayaran[] makanan = {
            new Makanan(),
            new Makanan(),
            new Makanan()
        };

        double[] hargaMakanan = {15000, 25000, 10000};
        String[] namaMakanan = {"Roti", "Susu", "Kue"};

        //   OUTPUT ELEKTRONIK
        
        System.out.println("========================================");
        System.out.println("        DAFTAR PRODUK ELEKTRONIK        ");
        System.out.println("========================================");
        
        for (int i = 0; i < elektronik.length; i++) {
            double pajak = elektronik[i].hitungPajak(hargaElektro[i]);
            double total = hargaElektro[i] + pajak;

            System.out.println((i + 1) + ". " + namaElektro[i]);
            System.out.println("   Harga       : Rp " + hargaElektro[i]);
            System.out.println("   Pajak (10%) : Rp " + pajak);
            System.out.println("   Total Bayar : Rp " + total);
            System.out.println("----------------------------------------");
        }

        //   OUTPUT MAKANAN

        System.out.println("\n========================================");
        System.out.println("         DAFTAR PRODUK MAKANAN             ");
        System.out.println("========================================");

        for (int i = 0; i < makanan.length; i++) {
            double pajak = makanan[i].hitungPajak(hargaMakanan[i]);
            double total = hargaMakanan[i] + pajak;

            System.out.println((i + 1) + ". " + namaMakanan[i]);
            System.out.println("   Harga       : Rp " + hargaMakanan[i]);
            System.out.println("   Pajak (5%)  : Rp " + pajak);
            System.out.println("   Total Bayar : Rp " + total);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n========= PROGRAM SELESAI =========");
    }
}

