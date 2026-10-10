import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka 1: ");
        int a = in.nextInt();

        System.out.print("Pilih operator (+, -, *, /): ");
        char op = in.next().charAt(0);

        System.out.print("Masukkan angka 2: ");
        int b = in.nextInt();

        if (op == '+') {
            System.out.println("Hasil: " + (a + b));
        } else if (op == '-') {
            System.out.println("Hasil: " + (a - b));
        } else if (op == '*') {
            System.out.println("Hasil: " + (a * b));
        } else if (op == '/') {
            System.out.println("Hasil: " + (a / b));
        } else {
            System.out.println("Operator salah!");
        }
    }
}
