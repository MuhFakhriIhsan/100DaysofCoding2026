import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nilai A :");
        int  A = in.nextInt();
        System.out.print("Nilai B :");
        int  B = in.nextInt();

        System.out.println("Setelah ++ :" + ++A);
        System.out.println("Setelah -- :" + --B);

         boolean Hasil = (A < B ) && (A > B) || (A != B);

         System.out.println("Hasil akhir : " + Hasil);


    }
}
