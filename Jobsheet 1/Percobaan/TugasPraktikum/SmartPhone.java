package Percobaan.TugasPraktikum;
public class SmartPhone extends Gadget{
    String camera;
    int kuotaInternet;

    SmartPhone(String merek, int ukuranLayar, String processor, String ram, String camera, int kuotaInternet){
        this.merek = merek;
        this.ukuranLayar = ukuranLayar;
        this.processor = processor;
        this.ram = ram;
        this.camera = camera;
        this.kuotaInternet = kuotaInternet;
    }

    void foto(){
        System.out.println("Cekrek");
    }

    void hotspotOn(){
            System.out.println("Mengaktifkan hotspot");
    }

    void hotspotOff(){
        System.out.println("Menonaktifkan hotspot");
    }

    @Override
    void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Camera: " + camera);
        System.out.println("Kuota Internet: " + kuotaInternet);
    }
}
