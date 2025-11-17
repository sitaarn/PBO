package praktikumpbo_10;


public class PraktikumPBO_10 {
    public static void main(String[] args) {
        
        OperasiHitung penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5));

        OperasiHitung pengurangan = new Pengurangan();
        System.out.println("Pengurangan: " + pengurangan.hitung(10, 5));
    }
}
