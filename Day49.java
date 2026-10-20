import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai :");
        int a = in.nextInt();

        String b = a >= 75 ? "LULUS" : "TINGGAL KELAS";
        System.out.println(b);
    }
}
