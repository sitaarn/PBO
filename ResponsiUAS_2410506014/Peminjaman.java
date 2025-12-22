package Responsi_UAS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Peminjaman implements Transaksi, Serializable {

    // KOMPOSISI → Peminjaman memiliki Buku
    private List<Buku> daftarBuku = new ArrayList<>();
    private Anggota anggota;

    public Peminjaman(Anggota anggota) {
        this.anggota = anggota;
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    @Override

    public void pinjam() {
        System.out.println("================================");
        System.out.println("DATA PEMINJAMAN BUKU");
        System.out.println("================================");
        System.out.println("Peminjam : " + anggota.getNama());
        System.out.println("Daftar Buku:");

        int no = 1;
        for (Buku b : daftarBuku) {
            System.out.println("  " + no++ + ". "
                    + b.getJudul() + " (" + b.getPenulis() + ")");
        }
        System.out.println();
    }

    @Override
    public void kembali() {
        System.out.println("================================");
        System.out.println("PROSES PENGEMBALIAN BUKU");
        System.out.println("================================");
        System.out.println("Pengembali : " + anggota.getNama());
        System.out.println("Daftar Buku yang Dikembalikan:");

        if (daftarBuku.isEmpty()) {
            System.out.println("  - Tidak ada buku yang sedang dipinjam");
        } else {
            int no = 1;
            for (Buku b : daftarBuku) {
                System.out.println("  " + no++ + ". "
                        + b.getJudul() + " (" + b.getPenulis() + ")");
            }
        }

        daftarBuku.clear();
        System.out.println("\nStatus: Semua buku berhasil dikembalikan.\n");
    }
} 
