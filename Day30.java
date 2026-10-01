import java.util.Scanner;

public class Day30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nilai A:");
        int A = in.nextInt();
        System.out.print("Nilai B:");
        int B = in.nextInt();
        System.out.print("Nilai C:");
        int C = in.nextInt();

        System.out.print("Menggunakan operator <=\n");
        System.out.println(B<=A);
        System.out.println(A<=C);
        System.out.println(A<=B);

        System.out.print("Menggunakan operator >=\n");
        System.out.println(A>=B);
        System.out.println(A>=C);
        System.out.println(B>=A);
    }
}
