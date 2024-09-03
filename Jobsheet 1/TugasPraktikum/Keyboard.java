import java.util.Scanner;

public class Keyboard {
    String merek;
    String warna;
    String tipe;

    Keyboard(String merek, String warna, String tipe) {
        this.merek = merek;
        this.warna = warna;
        this.tipe = tipe;
    }

    void typing(String type) {
        System.out.println(type);
    }

    void delete(){
        System.out.println("Serius delet ?");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("\033H\033[2J");
        System.out.println("pesan telah terhapus");
    }

    void cetakInformasi(){
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Tipe: " + tipe);
    }

    
}
