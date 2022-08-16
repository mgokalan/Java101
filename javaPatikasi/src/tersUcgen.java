import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int number = input.nextInt();

        for (int k = number; k>=1; k--){
            for (int j = 0; j<=number-k; j++ ){
                System.out.print(" ");
            }
            for (int i = k*2-1; i >=1; i--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
