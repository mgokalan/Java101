import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1, kucuk, i = 1;

        System.out.print("N1 : ");
        n1 = inp.nextInt();
        System.out.print("N2 : ");
        n2 = inp.nextInt();

        if (n1 < n2) {
            kucuk = n1;
        } else {
            kucuk = n2;
        }
        while (kucuk > 0) {
            if (n1 % kucuk == 0 && n2 % kucuk == 0) {
                System.out.println("ebob = " + kucuk);
                break;
            }
            kucuk--;
        }
        while (i <= n1*n2){
            if(i % n1 == 0 && i % n2 == 0) {
                System.out.println("ekok = " + i);
                break;
            }
            i++;
        }
    }
}
