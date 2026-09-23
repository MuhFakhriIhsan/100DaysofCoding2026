import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan sisi persegi : ");
        int sisi = in.nextInt();

        int kali = sisi*sisi;

        System.out.printf("Luas persegi :%d cm\u00B2 " , kali);
    }
}
