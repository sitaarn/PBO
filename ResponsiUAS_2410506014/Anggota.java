
package Responsi_UAS;

import java.io.Serializable;

public class Anggota implements Serializable {
    private String id;
    private String nama;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }
}

