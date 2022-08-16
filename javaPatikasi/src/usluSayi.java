import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        int alt, ust, sonuc=1;

        Scanner input = new Scanner(System.in);
        System.out.print("alti giriniz : ");
        alt = input.nextInt();
        System.out.print("ustu giriniz : ");
        ust = input.nextInt();

        for (int i = 1; i <= ust; i++) {
            sonuc *= alt;
        }
        System.out.println("sonuc = "+sonuc);
    }
}
