import java.util.Scanner;

public class Day72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;

        while (true) {
            int a = in.nextInt();

            if (a < 0) {
                break;
            }

            total += a;
        }

        System.out.println(total);
    }
}
