import java.util.Scanner;

public class PalindromWord {

    static boolean isPalindrom(String word) {
        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the word: ");
        String word = input.nextLine();

        if (isPalindrom(word)) {
            System.out.print(word + " is a palindrom word");
        } else {
            System.out.print(word + " is NOT a palindrom word");
        }
    }
}
