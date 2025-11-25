package Tugas;

import java.io.Serializable;

public class Buku implements Serializable {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return judul + ";" + pengarang + ";" + tahunTerbit;
    }

    public void tampilkan() {
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}

