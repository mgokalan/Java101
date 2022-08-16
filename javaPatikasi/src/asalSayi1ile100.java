import java.util.Scanner;

public class asalSayi1ile100 {
    public static void main(String[] args) {
        for (int i=2;i<=100; i++){
            boolean control = false;
            for (int j = 2; j<i; j++){
                if (i%j == 0){
                    control = true;
                }
            }
            if (control == false){
                System.out.print(i+",");
            }
        }
    }
}
