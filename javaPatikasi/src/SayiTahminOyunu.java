import java.util.*;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        //System.out.println("Secret number is " + number);
        Scanner input = new Scanner(System.in);
        int count = 0;
        int[] mistakes = new int[5];
        boolean isWrong = false;

        while (count < 5) {
            System.out.print("Please enter your number: ");
            int selected = input.nextInt();
            if (isWrong){
                System.out.println("You entered wrong number too many times. "+ (5-++count)+ " right " +
                        "remaining");
            }
            if (selected < 0 || selected > 99) {
                System.out.println("Please enter the number between 0-100");
                isWrong = true;
                continue;
            }
            if (selected == number) {
                System.out.println("Congratulations you find the secret number " + number);
                break;
            } else if (selected > number) {
                System.out.println("Entered number is bigger than secret number");
            } else {
                System.out.println("Entered number is smaller than secret number");
            }
            mistakes[count] = selected;
            count++;
            System.out.println((5 - count) + " right remaining!");
            if (count == 5) {
                System.out.println("You tried below numbers but secret number was " + number);
                System.out.println(Arrays.toString(mistakes));
            }
        }
    }
}