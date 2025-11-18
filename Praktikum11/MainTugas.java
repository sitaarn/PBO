package Tugas;

public class MainTugas {
    public static void main(String[] args) {

        // DATA PENGARANG (Agregasi) 
        Pengarang p1 = new Pengarang("Tere Liye");
        Pengarang p2 = new Pengarang("J.K. Rowling");
        Pengarang p3 = new Pengarang("Andrea Hirata"); 
        
        // DATA BUKU (Setiap buku punya pengarang) 
        Buku b1 = new Buku("Bulan", p1);
        Buku b2 = new Buku("Harry Potter", p2);
        Buku b3 = new Buku("Laskar Pelangi", p3); 

        // PERPUSTAKAAN (Komposisi menggunakan array) 
        Perpustakaan perpustakaan = new Perpustakaan(10);

        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3); 

        // OUTPUT
        System.out.println("====================================");
        System.out.println("       SISTEM PERPUSTAKAAN");
        System.out.println("====================================");
        perpustakaan.infoPerpustakaan();
        System.out.println("====================================");
        System.out.println(" Total Buku :  " + 3);
        System.out.println("====================================");
    }
}

