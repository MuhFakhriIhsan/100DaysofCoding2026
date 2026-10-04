import java.util.Scanner;

public class Day33{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nilai Siswa :");
        int A = in.nextInt();

        if (A>=75) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

    }
}
