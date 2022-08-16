import java.util.Scanner;

public class manavKasa {
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
        tutar = armut * armutKilo + elma * elmaKilo + domates * domatesKilo + muz * muzKilo + patlican * patlicanKilo;
        System.out.println("Toplam tutar : " + tutar);
    }
}
