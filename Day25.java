import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Jari-jari : ");
        double r = in.nextDouble();

        double luas = Math.PI*r*r;

        System.out.printf("Luas lingkaran :%.2f " , luas);
    }
}
