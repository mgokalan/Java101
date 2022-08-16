import java.util.Scanner;

public class dortVeBesinKuvvetleri {
    public static void main(String[] args) {
        int number;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Sayiyi giriniz : ");
        number = girdi.nextInt();

        for (int i=1,j=1; i<=number || j<=number; i*=4,j*=5){
            if (j > number){
                System.out.println(i);
                continue;
            }
            System.out.println(i + ", " + j);
        }
    }
}
