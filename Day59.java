import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N\t\t: ");
        int n = in.nextInt();
        System.out.print("Masukkan kelipatan M\t: ");
        int m = in.nextInt();

        for ( int b = 1; b<=n; b++){
            if ( b % m == 0){
                System.out.println(b);
            }
        }
        
    }
}
