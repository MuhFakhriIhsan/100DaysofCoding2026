import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int b = 1 ; b <= n ; b++){
            System.out.print(b + "|");
        }
        for (int b = n ; b >= 1 ; b--){
            System.out.print(b + ",");
        }
        
    }
}
