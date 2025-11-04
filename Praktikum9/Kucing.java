package praktikum9;

// Kelas turunan dari Hewan
class Kucing extends Hewan {

    Kucing(String jenis) {
        super(jenis);
    }

    @Override
    void suara() {
        System.out.println(jenis + " mengeluarkan suara: Meong");
    }
}

// Kelas turunan dari Hewan
class Anjing extends Hewan {

    Anjing(String jenis) {
        super(jenis);
    }

    @Override
    void suara() {
        System.out.println(jenis + " mengeluarkan suara: Guk Guk");
    }
}
