import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String a = in.next();

        System.out.println("1. trim():"+ a.trim());
        System.out.println("2. replace('a', 'o'): " + a.replace('a', 'o'));
        System.out.println("3. substring(0, 3): " + a.substring(0, 3));
    }
}
