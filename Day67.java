import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= a; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
