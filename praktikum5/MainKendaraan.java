package Tugas2;

public class MainKendaraan {

    public static void main(String[] args) {
        //Kendaraan Mobil
        System.out.println("===== Kendaraan Mobil =====");
        Mobil mobil = new Mobil();
        mobil.nama = "Honda Civic";
        mobil.kecepatan = 200;
        mobil.jumlahRoda = 4;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();

        System.out.println();
        
        //Kendaraan SepedaMotor
        System.out.println("===== Kendaraan Motor =====");
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Kawasaki Ninja";
        motor.kecepatan = 180;
        motor.jumlahRoda = 2;
        motor.jenisMesin = "4-Tak";
        motor.tampilkanInfo();
    }
    
}
