package praktikum12;

    import java.io.*;

public class SerializationPractice {

    public void simpanObjek(Produk produk, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(produk);
            System.out.println("Objek Produk berhasil disimpan ke file: " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan objek.");
        }
    }

    public Produk bacaObjek(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Produk) ois.readObject();
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat membaca objek.");
            return null;
        }
    }
}


