package praktikum9;

public class MainHewan {

    public static void main(String[] args) {
        Hewan kucing = new Kucing("Kucing Anggora");
        Hewan anjing = new Anjing("Anjing Husky");

        kucing.info();
        kucing.suara();
        kucing.makan();

        System.out.println();

        anjing.info();
        anjing.suara();
        anjing.makan();
    }
}
