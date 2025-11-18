package praktikum11;

public class MainPerpus {
    public static void main(String[] args) {

        Perpustakaan p = new Perpustakaan();

        p.tambahBuku(new Buku("Pemrograman Java"));
        p.tambahBuku(new Buku("Struktur Data"));

        p.infoPerpustakaan();
    }
}

