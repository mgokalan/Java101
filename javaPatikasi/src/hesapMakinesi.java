import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        double n1, n2;
        int islem;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz : ");
        n1 = input.nextDouble();
        System.out.print("ikinci sayiyi giriniz : ");
        n2 = input.nextDouble();

        System.out.println("1-toplam\n2-cikarma\n3-carpma\n4-bolme\nislemi tuslayiniz");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("toplam = " + (n1 + n2));
                break;
            case 2:
                System.out.println("cikarma = " + (n1 - n2));
                break;
            case 3:
                System.out.println("carpim = " + (n1 * n2));
                break;
            case 4:
                System.out.println(((n2 == 0) ? "0'a bolunemez" : "bolum = " + n1 / n2));
        }
    }
}
