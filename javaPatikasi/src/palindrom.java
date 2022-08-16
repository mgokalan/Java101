import java.util.Scanner;

public class palindrom {

    static String isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastnumber;

        while (temp != 0){
            lastnumber = temp % 10;
            reverseNumber = reverseNumber*10 + lastnumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return number + " is palindrom number";
        else
            return number + " is NOT palindrom number";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        System.out.println(isPalindrom(number));
    }
}