import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("===BUAT AKUN BARU===");
        System.out.print("Buat Username: ");
        String user = in.nextLine().trim();

        System.out.print("Buat Password: ");
        String pas = in.nextLine().trim();

        System.out.println("Registrasi Berhasil\n");

        do {
            System.out.print("Username: ");
            String u = in.nextLine().trim();
            
            System.out.print("Password: ");
            String p = in.nextLine().trim();

            if (u.equals(user) && p.equals(pas)) {
                System.out.println("Login Berhasil");
                break;
            }
            System.out.println("Salah! Coba lagi");
        } while (true);
    }
}
