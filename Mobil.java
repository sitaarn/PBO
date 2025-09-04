package tugaspbo3;

public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;

    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    void startEngine() {
        System.out.println("Mesin mobil " + getMerk() + " menyala");
    }

    void displayInfo(int nomor) {
        System.out.println("===== Deskripsi Mobil " + nomor + " =====");
        System.out.println("Merk   : " + getMerk());
        System.out.println("Model  : " + getModel());
        System.out.println("Tahun  : " + getTahun());
        System.out.println("Warna  : " + getWarna());
        startEngine();
    }

    public void gantiWarna(String warnaBaru, int nomor) {
        this.warna = warnaBaru;
        System.out.println("---------------------------------------");
        System.out.println("=== Ubah Warna Mobil " + nomor + " ===");
        System.out.println("Warna mobil berhasil diubah menjadi: " + warnaBaru);
    }

        
    public static void main (String[] args) {
        Mobil mbl1 = new Mobil("Porsche", "Prsc 911", 2013, "Merah");
        Mobil mbl2 = new Mobil("Hyundai", "Palisade", 2024, "Putih");

        mbl1.displayInfo(1);
        mbl2.displayInfo(2);

        mbl1.gantiWarna("Hitam", 1);
        mbl1.displayInfo(1);
    }
    
}

