import java.util.Scanner;

public class Day42 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah gaji :");
        int gaji = in.nextInt();

        System.out.print("Masukkan jumlah potongan :");
        int potongan = in.nextInt();

        int bersih = gaji-potongan;

        if (gaji > potongan){
            System.out.println("Gaji bersih " + bersih);
        } else {
            System.out.println("Potongan kebanyakan");
        }
        
    }
}
