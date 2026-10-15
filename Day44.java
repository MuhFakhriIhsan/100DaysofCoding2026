import java.util.Scanner;

public class Day44 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai = in.nextInt();

        if (nilai >= 85 && nilai <= 100) {
            System.out.println("Predikat: A");
        } else if (nilai >= 75 && nilai < 85) {
            System.out.println("Predikat: B");
        } else if (nilai >= 65 && nilai < 75) {
            System.out.println("Predikat: C");
        } else if (nilai >= 50 && nilai < 65) {
            System.out.println("Predikat: D");
        } else if (nilai >= 0 && nilai < 50) {
            System.out.println("Predikat: E");
        } else {
            System.out.println("Nilai tidak valid");
        }

    }

    }
