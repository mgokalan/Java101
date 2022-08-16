import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n,r, nFak =1, rFak=1, nEksiRFak=1;

        System.out.print("n yi giriniz : ");
        n = input.nextInt();
        System.out.print("r yi giriniz : ");
        r = input.nextInt();

        for (int i = 1; i<=n; i++){
            nFak *=i;
            if(r == i){
                rFak = nFak;
            }
            if(n-r == i){
                nEksiRFak = nFak;
            }
        }
        System.out.println("n nin r li kombinasyonu = " + nFak/(rFak*nEksiRFak));
        System.out.println("n nin r li permutasyonu = " + nFak/nEksiRFak);
    }
}
