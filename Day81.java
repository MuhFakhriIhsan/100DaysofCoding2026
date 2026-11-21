import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] angka = new int[2];

        for (int a = 0; a < angka.length; a++) {
            System.out.print("Masukkan angka ke- " + (a+1) + ":");
            angka [a] = in.nextInt();
        }
        for (int b = 0; b < angka.length; b++) {
            System.out.println(angka[b]);
        }

    }
}
