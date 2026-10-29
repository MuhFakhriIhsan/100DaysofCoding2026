import java.util.Scanner;

public class Day58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int b = n ; b >= 1 ; b--){
            if ( b % 2 == 1){
                 System.out.print(b + " ");
            }
        }
        for (int b = n ; b >= 1 ; b--){
             if ( b % 2 == 0){
                 System.out.print(b + " ");
             }
        }
        
    }
}
