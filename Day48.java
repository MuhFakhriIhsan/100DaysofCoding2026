import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka :");
        int a = in.nextInt();
        System.out.print("Masukkan operator :");
        char b = in.next().charAt(0);
        System.out.print("Masukkan angka :");
        int c = in.nextInt();

        switch (b){
            case '+':
            System.out.println("Hasil : " + (a+c));
            break;
            case '-':
            System.out.println("Hasil : " + (a-c));
            break;
            case '*':
            System.out.println("Hasil : " + (a*c));
            break;
            case '/':
            System.out.println("Hasil : " + (a/c));
            break;
            default:
            System.out.println("Operator salah");
        }
    }
}
