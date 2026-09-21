import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nilai A : ");
        int nilaiA = in.nextInt();
        System.out.print("Nilai B : ");
        int nilaiB = in.nextInt();

        int temp = nilaiA;
        nilaiA = nilaiB;
        nilaiB = temp;

        System.out.printf("Nilai A setelah ditukar :%d%n " , nilaiA);
        System.out.printf("Nilai B setelah ditukar :%d " , nilaiB);
    

    }
}
