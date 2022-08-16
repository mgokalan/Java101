import java.util.Scanner;

public class desen {

    static void minus(int n, int k) {
        if (n > 0) {
            n -= 5;
            System.out.print(n + " ");
        } else {
            plus(n, k);
            return;
        }
        minus(n, k);
    }

    static void plus(int n, int k){
        if (n < k) {
            n += 5;
            System.out.print(n + " ");
        }else {
            return;
        }
        plus(n, k);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = input.nextInt(), tempNum = num;
        System.out.print(num + " ");

        minus(num, tempNum);
    }
}
