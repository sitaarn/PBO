package Tugas;

public class Buku {
    private String judul;
    private Pengarang pengarang; // agregasi

    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public void infoBuku() {
        System.out.println("Judul Buku  : " + judul);
        pengarang.infoPengarang();
    }
}
