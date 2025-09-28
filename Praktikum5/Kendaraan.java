package Tugas2;

 // Kelas Induk
public class Kendaraan {  
    String nama;
    int kecepatan;

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan Maks : " + kecepatan + " km/jam");
    }
}

// Kelas Menengah (turunan dari Kendaraan)
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda : " + jumlahRoda);
    }
}
    


