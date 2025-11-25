package praktikum12;

public class MainProduk {

    public static void main(String[] args) {

        SerializationPractice serializer = new SerializationPractice();
        String filePath = "produk.ser";

        // Membuat objek
        Produk produk = new Produk("Laptop", 9000000, 10);

        // Serialisasi
        serializer.simpanObjek(produk, filePath);

        // Deserialisasi
        Produk p = serializer.bacaObjek(filePath);
        if (p != null) {
            System.out.println("\nObjek yang dibaca dari file:");
            p.tampilkanInfo();
        }
    }
}
          
    