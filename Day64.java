import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = in.nextInt();
        int a = 1;

        for (int b = 1; b <= n; b++) {
            a = a * b;
        }

        System.out.println("Faktorial dari " + n + "!" + " adalah " + a);
    }
}
