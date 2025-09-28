package praktikum6;

public class Main {

    public static void main(String[] args) {
        Hewan kucing = new Hewan();
        kucing.bersuara();             // Output: Hewan bersuara
        kucing.makan("ikan");          // Memanggil metode makan() dari kelas Hewan
        kucing.makan("ikan", 2);       // Memanggil metode makan() yang overloaded
    }
   
}
