import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, tip;
        boolean isError = false;

        System.out.print("Km'yi giriniz : ");
        km = input.nextInt();
        System.out.print("Yasi giriniz : ");
        yas = input.nextInt();
        System.out.print("1-Tek yon\n2-Cift yon\ntuslayiniz : ");
        tip = input.nextInt();
        double mesafeTutari = km * 0.1;

        if (km<1){
            isError = true;
        }
        if (yas >=1 && yas <12){
            mesafeTutari *= 0.5;
        }else if (yas >= 12 && yas <= 24){
            mesafeTutari *= 0.9;
        } else if (yas > 24 && yas <=65) {
            mesafeTutari *= 1;
        } else if (yas > 65) {
            mesafeTutari *= 0.7;
        }else{
            isError = true;
        }
        if (tip == 1){
            mesafeTutari *=1;
        } else if (tip == 2) {
            mesafeTutari *=1.6;
        }else {
            isError = true;
        }
        if (isError){
            System.out.println("Hatali bir deger girdiniz!");
        }else {
            System.out.println("Toplam tutar : " + mesafeTutari + " TL");
        }
    }
}
