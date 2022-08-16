import java.util.Scanner;

public class sayiOrtalama3ve4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz : ");
        int number = input.nextInt(), count = 0, sum = 0;

        for (int i = 0; i < number;i++){
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                count += 1; //sıfırda 3 ve 4'e bölünür
            }
        }
        System.out.println("Ortalama = "+sum/count);
    }
}
