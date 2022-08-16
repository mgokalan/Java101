import java.util.Scanner;

public class usluSayiRecursive {

    static int usluSayi(int a, int b) {
        int result = 1;
        if (b==0){
            result = 1;
        }else {
            result = a* usluSayi(a,b-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("taban : ");
        int taban = input.nextInt();
        System.out.print("ust : ");
        int ust = input.nextInt();

        System.out.println(usluSayi(taban, ust));


    }
}
