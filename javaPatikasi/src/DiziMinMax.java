import java.util.Scanner;
import java.util.Arrays;

public class DiziMinMax {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz : ");
        int number = scan.nextInt();
        int min = array[0];
        int max = array[0];

        Arrays.sort(array);
        for (int i : array) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi = " + min);
        System.out.println("Girilen sayidan buyuk en yakin sayi = " + max);
    }
}
