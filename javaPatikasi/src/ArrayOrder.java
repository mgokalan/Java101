import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int boyut = input.nextInt();
        int[] array = new int[boyut];

        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". elemani giriniz : ");
            array[i] = input.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
