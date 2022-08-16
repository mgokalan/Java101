import java.util.Scanner;

public class vucutKitle {
    public static void main(String[] args) {
        double boy, kilo, kutleİndeksi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        boy = girdi.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = girdi.nextDouble();
        kutleİndeksi = kilo / (boy * boy);
        System.out.println("Vucut kitle indeksi : " + kutleİndeksi);

    }
}
