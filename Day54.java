import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
       int a = in.nextInt();

       for (int b = 1; b <= a; b++){
        if ((b % 3 == 0) ^ (b % 4 == 0)){
            System.out.println(b);
        }
       }
    }
}
