import java.util.Scanner;

public class asalSayiRecursive {
    static void Asal(int a, int b) {
        if (a == b) {
            System.out.println(a + " sayisi ASAL sayidir.");
            return;
        } else if (a % b == 0){
            System.out.println(a + " sayisi asal sayi degildir.");
        return;
    }
        Asal(a,b+1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number : ");
        int number = input.nextInt();

        Asal(number,2);
    }
}
