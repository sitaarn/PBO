
package Tugas;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookSystem {

    private static final String FILE_TEXT = "buku.txt";
    private static final String FILE_SERIAL = "buku.ser";

    private List<Buku> daftarBuku = new ArrayList<>();

    public void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU SISTEM BUKU ===");
            System.out.println("1. Tambah Buku (simpan ke buku.txt)");
            System.out.println("2. Simpan objek Buku ke buku.ser");
            System.out.println("3. Tampilkan isi buku.txt");
            System.out.println("4. Tampilkan isi buku.ser");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            int pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 -> tambahBuku(sc);
                case 2 -> simpanSerial();
                case 3 -> tampilTeks();
                case 4 -> tampilSerial();
                case 5 -> {
                    System.out.println("Keluar…");
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void tambahBuku(Scanner sc) {
        System.out.print("Judul        : ");
        String judul = sc.nextLine();
        System.out.print("Pengarang    : ");
        String pengarang = sc.nextLine();
        System.out.print("Tahun Terbit : ");
        int tahun = sc.nextInt();

        Buku buku = new Buku(judul, pengarang, tahun);
        daftarBuku.add(buku);

        // Simpan ke file teks
        try (FileWriter fw = new FileWriter(FILE_TEXT, true)) { 
            fw.write(buku.toString() + "\n");
            System.out.println("Buku berhasil disimpan ke buku.txt");
        } catch (IOException e) {
            System.out.println("Gagal menulis ke buku.txt");
        }
    }

    private void simpanSerial() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_SERIAL))) {
            oos.writeObject(daftarBuku);
            System.out.println("Objek Buku berhasil disimpan ke buku.ser");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan ke buku.ser");
        }
    }

    private void tampilTeks() {
        System.out.println("\n=== Isi buku.txt ===");
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_TEXT))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Tidak dapat membaca buku.txt");
        }
    }

    private void tampilSerial() {
        System.out.println("\n=== Isi buku.ser ===");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_SERIAL))) {
            List<Buku> list = (List<Buku>) ois.readObject();
            for (Buku b : list) {
                b.tampilkan();
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Tidak dapat membaca buku.ser");
        }
    }
}

