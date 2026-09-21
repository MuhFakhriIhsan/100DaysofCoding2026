import java.util.Scanner;

public class Day24 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Panjang : ");
        int panjang = in.nextInt();
        System.out.print("Lebar : ");
        int lebar = in.nextInt();

        int kali = panjang*lebar;

        System.out.printf("Luas persegi panjang :%d " , kali);

    }

}
