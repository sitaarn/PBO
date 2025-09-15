/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikumpbo4;

public class Main {

    public static void main(String[] args) {
        // Objek Pekerja
        Pekerja pk1 = new Pekerja("Septiana", 23, "Programmer", 6000000);
        
        // Menampilkan informasi pekerja dengan toString()
        System.out.println("=== Data awal === " );
        System.out.println(pk1.toString());
        
        // Ubah nama pekerja menggunakan setter
        pk1.setNama("Rani");
        System.out.println("=== Setelah ubah nama === ");
        System.out.println(pk1.toString());
        
       
    }
    
}
