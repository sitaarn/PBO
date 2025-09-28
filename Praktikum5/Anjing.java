package Tugas;

public class Anjing extends Hewan {
    String suaraAnjing;
    String warnaAnjing;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara       : " + suaraAnjing);
        System.out.println("Warna       : " + warnaAnjing);
    }
         
    
    
}
