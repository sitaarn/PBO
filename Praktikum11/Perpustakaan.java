package Tugas;

public class Perpustakaan {
    private Buku[] daftarBuku;   // komposisi (array)
    private int index = 0;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
    }

    public void tambahBuku(Buku buku) {
        if (index < daftarBuku.length) {
            daftarBuku[index] = buku;
            index++;
        } else {
            System.out.println("Perpustakaan penuh!");
        }
    }

    public void infoPerpustakaan() {
        System.out.println("=== Daftar Buku di Perpustakaan ===");
        for (int i = 0; i < index; i++) {
            daftarBuku[i].infoBuku();
            System.out.println("-----------------------");
        }
    }
}
