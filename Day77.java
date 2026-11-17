import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Buat Password baru: ");
        String pas = in.nextLine().trim();

        if (pas.length() >= 8 && pas.contains("@")) {
            System.out.println("Status: Password valid dan berhasil disimpan!");
        } else {
            System.out.println("Status: Password gagal! Syarat tidak terpenuhi.");
        }

    }
}
