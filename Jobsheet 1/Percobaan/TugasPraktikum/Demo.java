package Percobaan.TugasPraktikum;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("Logitech", "Hitam", "Mechanical TKL");
        Laptop laptop = new Laptop("Asus", 15, "Intel i5", "8GB", "NVIDIA", 5);
        Mouse mouse = new Mouse("Logitech", "Putih", "Gaming");
        SmartPhone smartphone = new SmartPhone("Samsung", 15, "Intel i5", "8GB", "12MP", 200);

        System.out.println("===========================================================");
        
        laptop.cetakInformasi();
        laptop.tambahKecepatanFan(5);
        laptop.mengurangiKecepatanFan(3);
        laptop.cetakInformasi();
        System.out.println("===========================================================");
        
        
        mouse.cetakInformasi();
        mouse.movingCursor();
        mouse.clicking();
        System.out.println("===========================================================");
        
        smartphone.foto();
        smartphone.hotspotOn();
        smartphone.hotspotOff();
        smartphone.cetakInformasi();
        System.out.println("===========================================================");
        
        
        keyboard.cetakInformasi();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();
        keyboard.typing(input);
        keyboard.delete();
    }
}
