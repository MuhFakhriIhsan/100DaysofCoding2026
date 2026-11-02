import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for (int b = 1; b <= a; b++) {
            System.out.print(b);
            for (int c = (b-1); c >= 1; c--) {
                System.out.print(c);
            }
            System.out.println();
            
        }  
    }
}
