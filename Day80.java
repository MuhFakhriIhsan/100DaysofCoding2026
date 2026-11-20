import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] buah = new String[2];

        System.out.print("Buah 0: ");
        buah[0] = in.next();

        System.out.print("Buah 1: ");
        buah[1] = in.next();

        System.out.print("Pilih indeks (0 atau 1): ");
        int indeks = in.nextInt();
        System.out.println("Hasil: " + buah[indeks]);

    }
}
