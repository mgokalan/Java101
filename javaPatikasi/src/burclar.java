import java.util.Scanner;

public class burclar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun, ay;
        boolean isError = false;
        String burc = "";

        System.out.print("Dogdugunuz gunu giriniz : ");
        gun = input.nextInt();
        System.out.print("Dogdugunuz ayi giriniz : ");
        ay = input.nextInt();

        if (ay == 1) {
            if (gun >= 1 && gun <= 21) {
                burc = "oglak";
            } else if (gun >= 21 && gun <= 31) {
                burc = "kova";
            } else {
                isError = true;
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 19) {
                burc = "kova";
            } else if (gun >= 20 && gun <= 29) {
                burc = "balik";
            } else {
                isError = true;
            }
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 20) {
                burc = "balik";
            } else if (gun >= 21 && gun <= 31) {
                burc = "koc";
            } else {
                isError = true;
            }
        } else if (ay == 4) {
            if (gun >= 1 && gun <= 20) {
                burc = "koc";
            } else if (gun >= 21 && gun <= 30) {
                burc = "boga";
            } else {
                isError = true;
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 21) {
                burc = "boga";
            } else if (gun >= 22 && gun <= 31) {
                burc = "ikizler";
            } else {
                isError = true;
            }
        } else if (ay == 6) {
            if (gun >= 1 && gun <= 22) {
                burc = "ikizler";
            } else if (gun >= 23 && gun <= 30) {
                burc = "yengec";
            } else {
                isError = true;
            }
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 22) {
                burc = "yengec";
            } else if (gun >= 23 && gun <= 31) {
                burc = "aslan";
            } else {
                isError = true;
            }
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 22) {
                burc = "aslan";
            } else if (gun >= 23 && gun <= 31) {
                burc = "basak";
            } else {
                isError = true;
            }
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 22) {
                burc = "basak";
            } else if (gun >= 23 && gun <= 30) {
                burc = "terazi";
            } else {
                isError = true;
            }
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 22) {
                burc = "terazi";
            } else if (gun >= 23 && gun <= 31) {
                burc = "akrep";
            } else {
                isError = true;
            }
        } else if (ay == 11) {
            if (gun >= 1 && gun <= 21) {
                burc = "akrep";
            } else if (gun >= 22 && gun <= 30) {
                burc = "yay";
            } else {
                isError = true;
            }
        } else if (ay == 12) {
            if (gun >= 1 && gun <= 21) {
                burc = "yay";
            } else if (gun >= 22 && gun <= 29) {
                burc = "oglak";
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }
        if (isError) {
            System.out.println("hatali giris yaptiniz");
        } else {
            System.out.println("Burcunuz " + burc);
        }
    }
}
