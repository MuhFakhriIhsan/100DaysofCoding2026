import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Kata/kalimat: ");
        String a = in.nextLine();

        if (a.isEmpty()) {
            System.out.println("Pesan kosong!");
        } else if (a.equals("Halo dunia")) {
            System.out.println("Sama Persis");
        } else if (a.equalsIgnoreCase("halo dunia")) {
            System.out.println("beda huruf besar/kecil");
        } else if (a.contains("dunia")) {
            System.out.println("Mengandung kata dunia");
        } else {
            System.out.println("Pesan biasa.");
        }
    }
}
