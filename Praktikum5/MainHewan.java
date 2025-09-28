package Tugas;

public class MainHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        System.out.println("=== Informasi Hewan Kucing ===");
        kucing.nama = "Leo";
        kucing.jenis = "Persia";
        kucing.warnaKucing = "Mix Coklat-Abu";
        kucing.suaraKucing = "Miaw.. Miaw..";
        kucing.tampilkanInfo();
     
        Anjing anjing = new Anjing();
        System.out.println("\n=== Informasi Hewan Anjing ===");
        anjing.nama = "Snowy";
        anjing.jenis = "Husky";
        anjing.warnaAnjing = "Abu-Putih";
        anjing.suaraAnjing = "Guk.. Guk..";
        anjing.tampilkanInfo();
        
 
    }
}
        
     
    
    
