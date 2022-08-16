import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String userName, password, yesNo, newPass;

        Scanner input = new Scanner(System.in);

        System.out.print("kullanici adinizi giriniz : ");
        userName = input.nextLine();
        System.out.print("sifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("giris yaptiniz");
        } else {
            System.out.println("hatali kullanici adi ve/veya parola");
            System.out.println("sifre sifirlamak ister misiniz? E/H");
            yesNo = input.nextLine();
            if (yesNo.equals("E")) {
                System.out.print("yeni sifreyi giriniz :");
                newPass = input.nextLine();
                while (newPass.equals(password)) {
                    System.out.println("sifre olusturulamadi, lutfen baska sifre giriniz.");
                    System.out.print("yeni sifreyi giriniz :");
                    newPass = input.nextLine();
                }
                System.out.println("Sifre olusturuldu");
            } else {
                System.out.println("ok boss");
            }
        }

    }
}
