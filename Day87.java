import java.util.Arrays;
import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] angka = new int[3];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = in.nextInt();
        }

        for (int i = 0; i < angka.length; i++) {
            angka[i] = angka[i] + 10;
        }

        Arrays.sort(angka);

        for (int i = 0; i < 3; i++) {
            System.out.println(angka[i]);
        }
    }
}
