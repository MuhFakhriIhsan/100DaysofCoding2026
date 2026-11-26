import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] angka = new int[3];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + i + ": ");
            angka[i] = in.nextInt();
        }

        System.out.print("Angka yang dicari: ");
        int cari = in.nextInt();

        int posisi = -1;
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == cari) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Ketemu di indeks ke-" + posisi);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}
