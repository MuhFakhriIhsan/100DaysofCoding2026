import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nilai A :");
        boolean A = in.nextBoolean();
        System.out.print("Nilai B :");
        boolean B = in.nextBoolean();

        System.out.println("Operator logika AND : " + (A && B));
        System.out.println("Operator logika OR : " + (A || B));
        System.out.println("Operator logika NOT : " + ( !A));
    }
}
