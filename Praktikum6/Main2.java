package praktikum6;

public class Main2 {

    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara();                  // Output: Meow

        Kucing kucing = new Kucing();
        kucing.makan("ikan");
        kucing.makan("ikan", 2);

        Anjing anjing = new Anjing();
        anjing.bersuara();                 // Output: Woof
        anjing.makan("daging", 3);
    }

}
