package Tugas2;

//Kelas Turunan SepedaMotor
public class SepedaMotor extends KendaraanDarat {

    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin : " + jenisMesin);
    }
}


