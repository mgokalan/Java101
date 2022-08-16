import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        // bu kod girilen sayinin rakamlari toplamini verir.
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int number = input.nextInt();
        int tempNumber = number, rakam, sum = 0;

        while (tempNumber != 0) {
            rakam = tempNumber % 10;
            sum += rakam;
            tempNumber /= 10;
        }
        System.out.println(sum);


        //Aşağıdaki kod 3 basamakli armstrong sayilarini bulan koddur.


        for (int sayi = 100; sayi<1000;sayi++){
            int tempSayi = sayi, basDegeri, toplam = 0;

            while (tempSayi != 0){
                basDegeri = tempSayi % 10;
                tempSayi /= 10;
                int toplamaGiren = 1;
                for (int k = 1; k<4; k++){
                    toplamaGiren *= basDegeri;
                }
                toplam += toplamaGiren;
            }
            if (sayi == toplam){
                System.out.println(toplam + " armstrong sayisidir");
            }
        }

    }
}
