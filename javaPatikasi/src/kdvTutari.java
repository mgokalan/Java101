import java.util.Scanner;

public class kdvTutari {
    public static void main(String[] args) {
        double tutar;
        System.out.printf("urunun fiyatini giriniz : ");
        Scanner inp = new Scanner(System.in);
        tutar = inp.nextDouble();
        boolean buyuk = tutar >= 1000;
        Double kdv = buyuk ? tutar * 0.08 : tutar * 0.18;
        Double kdvliFiyat = tutar + kdv;
        System.out.println("Urunun fiyati : " + tutar + " tl\nUrunun kdv miktari: " + kdv + " tl\ntotal fiyat: " + kdvliFiyat + " tl");
    }
}
