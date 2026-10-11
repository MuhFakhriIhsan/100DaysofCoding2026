import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan hari ke :");
        int a = in.nextInt();

        if (a >= 1 && a <= 5) {
            System.out.println("Hari kerja");
        } else if (a >= 6 && a <= 7) {
            System.out.println("Hari libur");
        } else {
            System.out.println("tidak valid");
        }

    }
}
