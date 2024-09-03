public class Mouse {
    String merek;
    String warna;
    String tipe;

    Mouse(String merek, String warna, String tipe) {
        this.merek = merek;
        this.warna = warna;
        this.tipe = tipe;
    }
    void movingCursor() {
        System.out.println("Menggerakkan kursor");
    }

    void clicking() {
        System.out.println("Mengklik");
    }

    void cetakInformasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Tipe: " + tipe);
    }
}
