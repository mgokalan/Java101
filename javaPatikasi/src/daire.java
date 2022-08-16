import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        double r, pi = 3.14, alfa;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Yaricapi giriniz : ");
        r = girdi.nextDouble();
        System.out.print("Alfa acisini giriniz : ");
        alfa = girdi.nextDouble();
        double alan = pi * r * r * alfa / 360;
        System.out.println("Daire diliminin alani = " + alan);
    }
}
