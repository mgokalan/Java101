import java.util.Scanner;

public class etkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter heat : ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.print("Go to the ski!");
        } else if (heat<10) {
            System.out.print("Go to the cinema!");
        } else if (heat<=15) {
            System.out.print("You may go to the cinema or picnic");
        } else if (heat<=25) {
            System.out.print("Go to the picnic");
        }else {
            System.out.println("go to the swim");
        }
    }
}
