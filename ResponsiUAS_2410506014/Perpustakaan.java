package Responsi_UAS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan implements Serializable {

    // AGREGASI → Perpustakaan memiliki Anggota
    private List<Anggota> daftarAnggota = new ArrayList<>();
    private List<Buku> daftarBuku = new ArrayList<>();

    public void tambahAnggota(Anggota a) {
        daftarAnggota.add(a);
    }

    public void tambahBuku(Buku b) {
        daftarBuku.add(b);
    }

    public List<Buku> getDaftarBuku() {
        return daftarBuku;
    }

    public List<Anggota> getDaftarAnggota() {
        return daftarAnggota;
    }
}

