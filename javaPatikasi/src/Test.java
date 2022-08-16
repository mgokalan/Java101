import java.util.Scanner;

public class Test {
    /*public static void main(String[] args) {
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


    public static void main(String[] args) {
        double tutar;
        System.out.printf("urunun fiyatini giriniz : ");
        Scanner inp = new Scanner(System.in);
        tutar = inp.nextDouble();
        boolean buyuk = tutar >= 1000;
        Double kdv = buyuk ? tutar*0.08 : tutar*0.18;
        Double kdvliFiyat = tutar + kdv;
        System.out.println("Urunun fiyati : " + tutar + " tl\nUrunun kdv miktari: " + kdv + " tl\ntotal fiyat: " + kdvliFiyat + " tl" );
    }


    public static void main(String[] args) {
        double a, b, c, alan, dikKenar1, dikKenar2, hipotenus;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Hipotenus hesabi icin 1. dik kenari giriniz: ");
        dikKenar1 = girdi.nextDouble();
        System.out.print("Hipotenus hesabi icin 2. dik kenari giriniz: ");
        dikKenar2 = girdi.nextDouble();
        hipotenus = Math.sqrt(dikKenar1*dikKenar1 + dikKenar2*dikKenar2);
        System.out.println(hipotenus);

        System.out.print("Alan hesabi icin 1. kenari giriniz: ");
        a = girdi.nextDouble();
        System.out.print("Alan hesabi icin 2. kenari giriniz: ");
        b = girdi.nextDouble();
        System.out.print("Alan hesabi icin 3. kenari giriniz: ");
        c = girdi.nextDouble();

        double kenarToplam = (a+b+c)/2;
        alan = Math.sqrt(kenarToplam*(kenarToplam-a)*(kenarToplam-b)*(kenarToplam-c));
        System.out.println(alan);
    }



    public static void main(String[] args) {
        double km;
        Scanner girdi = new Scanner(System.in);
        System.out.print("kmyi giriniz: ");
        km = girdi.nextDouble();
        double tutar = km * 2.2 + 10;
        tutar = tutar < 20 ? 20 : tutar;
        System.out.println(tutar);
    }



    public static void main(String[] args) {
        double r, pi=3.14, alfa;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Yaricapi giriniz : ");
        r = girdi.nextDouble();
        System.out.println("Alfa acisini giriniz : ");
        alfa = girdi.nextDouble();
        double alan = pi * r * r *alfa/360;
        System.out.println("Daire diliminin alani = "+alan);
    }



    public static void main(String[] args) {
        double boy, kilo, kutleİndeksi;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz : ");
        boy = girdi.nextDouble();
        System.out.print("Kilonuzu giriniz : ");
        kilo = girdi.nextDouble();
        kutleİndeksi = kilo / (boy*boy);
        System.out.println("Vucut kitle indeksi : " + kutleİndeksi);

    }



    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, tutar, armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kac kilo? : ");
        armutKilo = input.nextDouble();
        System.out.print("Elma kac kilo? : ");
        elmaKilo = input.nextDouble();
        System.out.print("Domates kac kilo? : ");
        domatesKilo = input.nextDouble();
        System.out.print("Muz kac kilo? : ");
        muzKilo = input.nextDouble();
        System.out.print("Patlican kac kilo? : ");
        patlicanKilo = input.nextDouble();
        tutar = armut*armutKilo + elma*elmaKilo + domates*domatesKilo + muz*muzKilo + patlican*patlicanKilo;
        System.out.println("Toplam tutar : " + tutar);
    }



    public static void main(String[] args) {
        double n1, n2;
        int islem;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz : ");
        n1 = input.nextDouble();
        System.out.print("ikinci sayiyi giriniz : ");
        n2 = input.nextDouble();

        System.out.println("1-toplam\n2-cikarma\n3-carpma\n4-bolme\nislemi tuslayiniz");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("toplam = " + (n1 + n2));
                break;
            case 2:
                System.out.println("cikarma = " + (n1 - n2));
                break;
            case 3:
                System.out.println("carpim = " + (n1*n2));
            case 4:
                System.out.println(((n2==0) ? "0'a bolunemez" : "bolum = " + n1/n2));
        }


    }



    public static void main(String[] args) {
        String userName, password, yesNo, newPass;

        Scanner input = new Scanner(System.in);

        System.out.print("kullanici adinizi giriniz : ");
        userName = input.nextLine();
        System.out.print("sifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("giris yaptiniz");
        } else {
            System.out.println("hatali kullanici adi ve/veya parola");
            System.out.println("sifre sifirlamak ister misiniz? E/H");
            yesNo = input.nextLine();
            if (yesNo.equals("E")){
                System.out.print("yeni sifreyi giriniz :");
                newPass = input.nextLine();
                while (newPass.equals(password)){
                    System.out.println("sifre olusturulamadi, lutfen baska sifre giriniz.");
                    System.out.print("yeni sifreyi giriniz :");
                    newPass = input.nextLine();
                }
                System.out.println("Sifre olusturuldu");
            } else  {
                System.out.println("ok boss");
            }
        }

    }


    public static void main(String[] args) {
        int mat, fiz, turk, kim, muz, dersSayisi = 0, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("mat not : ");
        mat = input.nextInt();
        System.out.print("fiz not : ");
        fiz = input.nextInt();
        System.out.print("turk not : ");
        turk = input.nextInt();
        System.out.print("kim not : ");
        kim = input.nextInt();
        System.out.print("muz not : ");
        muz = input.nextInt();

        if (mat <= 100 && mat >= 0) {
            dersSayisi += 1;
            total += mat;
        }
        if (fiz <= 100 && fiz >= 0) {
            dersSayisi += 1;
            total += fiz;
        }
        if (turk <= 100 && turk >= 0) {
            dersSayisi += 1;
            total += turk;
        }
        if (kim <= 100 && kim >= 0) {
            dersSayisi += 1;
            total += kim;
        }
        if (muz <= 100 && muz >= 0) {
            dersSayisi += 1;
            total += muz;
        }

        double ortalama = total/dersSayisi;
        if (ortalama>= 55){
            System.out.println("\ntebrikler gectiniz.");
        }else {
            System.out.println("\nmaalesef kaldiniz.");
        }
        System.out.println("ortalama = " + ortalama);
    }

     */
}


