import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.printf("Mat notunu giriniz: ");
        mat = input.nextInt();
        System.out.printf("fizik notunu giriniz: ");
        fizik = input.nextInt();
        System.out.printf("kimya notunu giriniz: ");
        kimya = input.nextInt();
        System.out.printf("turkce notunu giriniz: ");
        turkce = input.nextInt();
        System.out.printf("tarih notunu giriniz: ");
        tarih = input.nextInt();
        System.out.printf("muzik notunu giriniz: ");
        muzik = input.nextInt();
        double sonuc = (mat + fizik + kimya + turkce + tarih + muzik)/6;
        double a = 60;
        boolean kosul = sonuc >= a;
        String str = kosul ? "gecti" : "kaldi";
        System.out.println(str);
    }
}
