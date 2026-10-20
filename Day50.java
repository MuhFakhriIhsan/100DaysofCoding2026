import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka :");
        int a = in.nextInt();

        String b = a % 2 == 0 ? "GENAP" : "GANJIL";
        System.out.println(b);
    }
}
