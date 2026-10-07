import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukka angka :");
        int angka = in.nextInt();
        
        if (angka % 2 == 0) {
            System.out.println("genap");
        } else {
            System.out.println("ganjil");
     }
    }
}
