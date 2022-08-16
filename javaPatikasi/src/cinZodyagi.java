import java.util.Scanner;

public class cinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year : ");
        int year = input.nextInt();
        String zodyag = "";

        year = year % 12;

        switch (year) {
            case 0:
                zodyag = "maymun";
                break;
            case 1:
                zodyag = "horoz";
                break;
            case 2:
                zodyag = "kopek";
                break;
            case 3:
                zodyag = "domuz";
                break;
            case 4:
                zodyag = "fare";
                break;
            case 5:
                zodyag = "okuz";
                break;
            case 6:
                zodyag = "kaplan";
                break;
            case 7:
                zodyag = "tavsan";
                break;
            case 8:
                zodyag = "ejderha";
                break;
            case 9:
                zodyag = "yilan";
                break;
            case 10:
                zodyag = "at";
                break;
            case 11:
                zodyag = "koyun";
                break;
        }
        System.out.println("You are " + zodyag);
    }
}
