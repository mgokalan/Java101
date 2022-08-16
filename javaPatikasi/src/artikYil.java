import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yili giriniz : ");
        int yil = input.nextInt();
        boolean artikYil = false;

        if (yil % 4 == 0){
            if (yil % 100 == 0){
                if (yil % 400 == 0){
                    artikYil = true;
                }
            }else {
                artikYil = true;
            }
        }
        if (artikYil){
            System.out.println(yil + " artik bir yildir");
        }else {
            System.out.println(yil + " artik bir yil DEGILDIR.");
        }
    }
}
