import java.util.Scanner;

class sinifGecme {
    public static void main(String[] args) {
        int mat, fiz, turk, kim, muz, dersSayisi = 0, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("mat not : ");
        mat = input.nextInt();
        System.out.print("fiz not : ");
        fiz = input.nextInt();
        System.out.print("turk not : ");
        turk = input.nextInt();
        System.out.print("kim not : ");
        kim = input.nextInt();
        System.out.print("muz not : ");
        muz = input.nextInt();

        if (mat <= 100 && mat >= 0) {
            dersSayisi += 1;
            total += mat;
        }
        if (fiz <= 100 && fiz >= 0) {
            dersSayisi += 1;
            total += fiz;
        }
        if (turk <= 100 && turk >= 0) {
            dersSayisi += 1;
            total += turk;
        }
        if (kim <= 100 && kim >= 0) {
            dersSayisi += 1;
            total += kim;
        }
        if (muz <= 100 && muz >= 0) {
            dersSayisi += 1;
            total += muz;
        }

        double ortalama = total / dersSayisi;
        if (ortalama >= 55) {
            System.out.println("\ntebrikler gectiniz.");
        } else {
            System.out.println("\nmaalesef kaldiniz.");
        }
        System.out.println("ortalama = " + ortalama);
    }
}
