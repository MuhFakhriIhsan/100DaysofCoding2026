import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);

        System.out.print("Masukkan umur :");
        int umur = in.nextInt();
         System.out.print("Keterangan sim :");
        boolean sim = in.nextBoolean();

        if (umur >= 17){
            if (sim) {
                System.out.println("Anda boleh mengendarai motor");
            } else {
                System.out.println("Anda belum memiliki sim");
            }
        } else {
            System.out.println("Umur anda belum cukup");
        }
    }
}
