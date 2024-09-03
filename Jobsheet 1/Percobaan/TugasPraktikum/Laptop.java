package Percobaan.TugasPraktikum;
public class Laptop extends Gadget{
    String GPU;
    int fanSpeed;

    Laptop(String merek, int ukuranLayar, String processor, String ram, String GPU, int fanSpeed){
        this.merek = merek;
        this.ukuranLayar = ukuranLayar;
        this.processor = processor;
        this.ram = ram;
        this.GPU = GPU;
        fanSpeed = 0;
    }

    void tambahKecepatanFan(int increment){
        fanSpeed = fanSpeed + increment;
    }

    void mengurangiKecepatanFan(int decrement){
        fanSpeed = fanSpeed - decrement;
    }

    @Override
    void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("GPU: " + GPU);
        System.out.println("Fan Speed: " + fanSpeed);
    }
}
