package Percobaan;

public class SepedaDemo {

    public static void main(String[] args) {
        // Buat dua buah objek sepeda
        Sepeda spdl = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();
        // Panggil method didalam objek sepeda
        spdl.setMerek("Polygone");
        spdl.tambahKecepatan(10);
        spdl.gantiGear(2);
        spdl.cetakStatus();
        spd2.setMerek("Wiim Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();
        spd3.setMerek("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas suspension");
        spd3.cetakStatus();
    }
}