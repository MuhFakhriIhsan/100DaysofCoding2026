import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===DAFTAR MENU===");
        System.out.println("1. MIE GORENG");
        System.out.println("2. MIE KUAH");
        System.out.println("3. MIE AYAM");
        System.out.println("4. MIE GACOAN");
        System.out.println("=================");

        System.out.print("MASUKKAN PILIHAN :");
        int a = in.nextInt();

        switch (a){
            case 1:
            System.out.println("MIE GORENG");
            break;
            case 2:
            System.out.println("MIE KUAH");
            break;
            case 3:
            System.out.println("MIE AYAM");
            break;
            case 4:
            System.out.println("MIE GACOAN");
            break;
            default:
            System.out.println("TIDAK DALAM MENU");
        }
    }
}
