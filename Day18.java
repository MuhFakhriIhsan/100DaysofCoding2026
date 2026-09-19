import java.util.Scanner;

public class Day18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Nilai int : ");
        int nilaiInt = in.nextInt();
        double nilaiDouble = nilaiInt;

        System.out.printf("Nilai double : %.1f " , nilaiDouble);
    }
}

