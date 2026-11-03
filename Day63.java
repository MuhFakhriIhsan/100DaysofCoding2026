import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();
        int a = 1;

        for (int b = 1; b <= N; b++){
            a *= M;
        }
        System.out.println(a);
    }
}
