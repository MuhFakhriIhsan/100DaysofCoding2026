import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Sisi : ");
        int sisi = in.nextInt();

        int kali = sisi*sisi;

        System.out.printf("Luas persegi :%d " , kali);
    }
}
