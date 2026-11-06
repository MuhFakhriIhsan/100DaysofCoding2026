import java.util.Scanner;

public class Day66 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int a,b;

        a = in.nextInt();
        b = in.nextInt();

        for (int c = 1; c <= a; c++) {
            for (int d = 1; d <= b; d++) {
                System.out.print((c + d) % 2 == 0 ? "# " : "0 ");
            }
            System.out.println();
        }
    }
}
