import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi, i = 1, kucukSayi = 0, buyukSayi = 0;

        System.out.print("kac sayi gireceksiniz? ");
        sayi = inp.nextInt();

        while (i <= sayi) {
            System.out.print(i + ". sayiyi giriniz: ");
            int girilenSayi = inp.nextInt();
            if (i == 1) {
                kucukSayi = girilenSayi;
                buyukSayi = girilenSayi;
            } else if (girilenSayi < kucukSayi) {
                kucukSayi = girilenSayi;
            } else if (girilenSayi>buyukSayi){
                buyukSayi = girilenSayi;
            }
            i++;
        }
        System.out.println("\nkucuk sayi = " + kucukSayi + "\nbuyuk sayi = " + buyukSayi);
    }
}
