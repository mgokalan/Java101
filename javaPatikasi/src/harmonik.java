import java.util.Scanner;

public class harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int number = input.nextInt();
        double total = 0;

        for (int i = 1; i <= number; i++) {
            total += (1.0 / i);
        }
        System.out.println("Toplam = " + total);
    }
}
