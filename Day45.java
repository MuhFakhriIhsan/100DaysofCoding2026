import java.util.Scanner;

public class Day45 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan hari ke 1-7 :");
        int a = in.nextInt();

        switch (a){
            case 1,2,3,4,5 :
            System.out.println("Hari kerja");
            break;
            case 6,7 :
            System.out.println("Weekend");
            break;
            default :
            System.out.println("Tidak valid");
            
        }

    }
}
