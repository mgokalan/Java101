import java.util.Arrays;
import java.util.Scanner;

public class MatrisTranspoze {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("satir : ");
        int n = inp.nextInt();
        System.out.print("sutun : ");
        int k = inp.nextInt();

        int[][] matris = new int[n][k];
        int[][] transpoze = new int[k][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j<k; j++){
                System.out.print((i+1)+". "+ (j+1)+". elemani giriniz : ");
                matris[i][j] = inp.nextInt();
            }
        }
        for (int i = 0; i < transpoze.length; i++){
            for (int j = 0; j< transpoze[i].length; j++){
                transpoze[i][j] = matris[j][i];
            }
        }
        System.out.print("\n=========================\n");
        System.out.println("Matris : \n");
        for (int i = 0; i< matris.length;i++){
            System.out.println(Arrays.toString(matris[i]));
        }
        System.out.print("\n=========================\n");

        System.out.println("Transpoze : \n");
        for (int i = 0; i< transpoze.length;i++) {
            System.out.println(Arrays.toString(transpoze[i]));
        }
    }
}
