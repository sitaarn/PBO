package praktikum11_Agregasi;

public class MainKlub {
    public static void main(String[] args) {

        Anggota a1 = new Anggota("Sita");
        Anggota a2 = new Anggota("Rani");
        Anggota a3 = new Anggota("Chikho");

        Klub klub = new Klub("Klub Belajar");

        klub.tambahAnggota(a1);
        klub.tambahAnggota(a2);
        klub.tambahAnggota(a3);

        klub.infoKlub();
    }
}
