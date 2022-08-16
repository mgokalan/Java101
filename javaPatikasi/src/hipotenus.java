import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        double a, b, c, alan, dikKenar1, dikKenar2, hipotenus;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Hipotenus hesabi icin 1. dik kenari giriniz: ");
        dikKenar1 = girdi.nextDouble();
        System.out.print("Hipotenus hesabi icin 2. dik kenari giriniz: ");
        dikKenar2 = girdi.nextDouble();
        hipotenus = Math.sqrt(dikKenar1 * dikKenar1 + dikKenar2 * dikKenar2);
        System.out.println("hipotenus : " + hipotenus);

        System.out.print("Alan hesabi icin 1. kenari giriniz: ");
        a = girdi.nextDouble();
        System.out.print("Alan hesabi icin 2. kenari giriniz: ");
        b = girdi.nextDouble();
        System.out.print("Alan hesabi icin 3. kenari giriniz: ");
        c = girdi.nextDouble();

        double kenarToplam = (a + b + c) / 2;
        alan = Math.sqrt(kenarToplam * (kenarToplam - a) * (kenarToplam - b) * (kenarToplam - c));
        System.out.println(alan);
    }
}
