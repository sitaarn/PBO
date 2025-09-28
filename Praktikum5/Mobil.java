package Tugas2;


//Kelas Turunan Mobil
public class Mobil extends KendaraanDarat {
        int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}
    
    
