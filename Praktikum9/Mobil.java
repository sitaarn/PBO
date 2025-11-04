
package praktikum9;

// Kelas turunan dari Kendaraan
class Mobil extends Kendaraan {

    @Override
    void berjalan() {
        System.out.println(
        "Mobil sedang berjalan dengan cepat.");
 }
}

class Sepeda extends Kendaraan {
 @Override
    void berjalan() {
        System.out.println(
        "\nSepeda sedang berjalan dengan pelan.");
 }
}

    

