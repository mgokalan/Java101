import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userNamee, pass;
        int right = 3, balance = 2000, select, price;

        while (right > 0) {
            right--;
            System.out.print("Kullanici adiniz : ");
            userNamee = inp.nextLine();
            System.out.print("Sifreniz : ");
            pass = inp.nextLine();
            if (userNamee.equals("patika") && pass.equals("dev123")) {
                System.out.println("Kodluyoruz Bankasina hos geldiniz !");
                do {
                    System.out.println("\n1-Para yatirma\n" +
                            "2-Para cekme\n" +
                            "3-Bakiye sorgula\n" +
                            "4-Cikis yap");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("yatirmak istediginiz miktar : ");
                            price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("cekmek istediginiz miktar : ");
                            price = inp.nextInt();
                            if (balance < price) {
                                System.out.println("bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Bankamizi kulladiginiz icin tesekkur ederiz.");
                break;
            } else {
                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur. Lutfen musteri hizmetleriyle iletisime " +
                            "gecin");
                } else {
                    System.out.println("Hatali kullanici adi veya parola. Lutfen tekrar deneyiniz");
                }
            }
        }
    }
}
