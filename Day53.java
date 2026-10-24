import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = in.nextInt();

            System.out.println("Angka kamu: " + angka);

        } while (angka != 0);
    }
}
