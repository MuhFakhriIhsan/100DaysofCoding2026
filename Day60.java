import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int c = 0;

        for (int b = 1; b <= a; b++) {

            c += b;
            
            System.out.println(c);
        }
    }
}
