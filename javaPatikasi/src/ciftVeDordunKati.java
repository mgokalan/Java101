import java.util.Scanner;

public class ciftVeDordunKati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, number;

        do {
            System.out.print("Sayi giriniz : ");
            number = input.nextInt();
            if (number % 4 == 0){
                sum += number;
            }
        }while (number % 2 == 0);
        System.out.println("toplam = " + sum);
    }
}
