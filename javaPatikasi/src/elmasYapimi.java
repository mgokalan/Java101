import java.util.Scanner;

public class elmasYapimi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int sayi = inp.nextInt();

        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < sayi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i +1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = sayi -1 ; i >= 0; i--) {
            for (int j = sayi-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 2*i +1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
