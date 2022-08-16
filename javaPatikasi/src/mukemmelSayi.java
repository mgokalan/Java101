import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number : ");
        int number = input.nextInt(), sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number){
            System.out.println(number + " is perfect number !");
        }else {
            System.out.println(number + " is not perfect number !");
        }
    }
}
