import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter number : ");
        int number = input.nextInt(), fibStart = 0, fibSecond = 1, fibNew;

        for (int i = 1; i <= number; i++) {
            if (i == 1) {
                System.out.print(fibStart + " ");
            } else if (i == 2) {
                System.out.print(fibSecond + " ");
            } else {
                fibNew = fibSecond + fibStart;
                System.out.print(fibNew + " ");
                fibStart = fibSecond;
                fibSecond = fibNew;
            }
        }
    }
}
