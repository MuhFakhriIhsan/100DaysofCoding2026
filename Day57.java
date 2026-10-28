import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int b = 1 ; b <= n ; b++){
            if ( b % 2 == 1){
                 System.out.print(b + " ");
            }
        }
        for (int b = 1 ; b <= n ; b++){
             if ( b % 2 == 0){
                 System.out.print(b + " ");
             }
        }
        
    }
}
