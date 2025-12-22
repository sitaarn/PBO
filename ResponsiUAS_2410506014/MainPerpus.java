package Responsi_UAS;

public class MainPerpus {

    public static void main(String[] args) {

        // Buat objek perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Tambah data
        Buku b1 = new Buku("B01", "Pemrograman Java", "James Gosling");
        Buku b2 = new Buku("B02", "Struktur Data", "Mark Allen");
        Buku b3 = new Buku("B03", "Pengenalan Big Data", "Louis Sainz");

        Anggota a1 = new Anggota("A01", "Arkan");
        Anggota a2 = new Anggota("A02", "Lily");

        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3);

        perpustakaan.tambahAnggota(a1);
        perpustakaan.tambahAnggota(a2);

        // Peminjaman
        Peminjaman p1 = new Peminjaman(a1);
        p1.tambahBuku(b1);
        p1.pinjam();

        Peminjaman p2 = new Peminjaman(a2);
        p2.tambahBuku(b2);
        p2.tambahBuku(b3);
        p2.pinjam();

        // Pengembalian
        p1.kembali();

        // Simpan data
        DataManager.simpanData(perpustakaan, "perpustakaan.dat");

        // Baca data
        Perpustakaan dataBaca
                = (Perpustakaan) DataManager.bacaData("perpustakaan.dat");

        if (dataBaca != null) {
            System.out.println("\nData berhasil dibaca kembali:");
            System.out.println("================================");
            System.out.println("DATA BUKU HASIL PEMBACAAN");
            System.out.println("================================");

            int no = 1;
            for (Buku b : dataBaca.getDaftarBuku()) {
                System.out.println(no++ + ". "
                        + b.getJudul() + " - " + b.getPenulis());
            }

        }
    }
}
