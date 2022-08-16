import java.util.Scanner;

public class fibonacciRecursive {

    static int fibonacci (int i){
        if (i == 1 || i == 2){
            return 1;
        } else {
            return fibonacci(i-1) + fibonacci(i-2);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fib number : ");
        int number = input.nextInt();

        System.out.println(fibonacci(number));
    }
}
