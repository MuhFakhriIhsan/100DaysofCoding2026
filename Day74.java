import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String a = in.next();
        
        System.out.println("Teks asli: " + a);
        System.out.println("Jumlah: " + a.length());
        System.out.println("Huruf besar: " + a.toUpperCase());
        System.out.println("Huruf kecil: " + a.toLowerCase());
        
    }
}
