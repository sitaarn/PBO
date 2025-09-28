package Tugas;


public class Kucing extends Hewan {
    String suaraKucing;
    String warnaKucing;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara       : " + suaraKucing);
        System.out.println("Warna       : " + warnaKucing);

    }

    
}
