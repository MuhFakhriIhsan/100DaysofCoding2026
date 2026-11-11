import java.util.Scanner;

public class Day71 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        
        for (int b = a; b >= 1; b--) {
            for (int c = 1; c <= b; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
