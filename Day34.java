import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan umur :");
        int umur = in.nextInt();

        if ( umur<13)  {
            System.out.println("anak anak");
        } else if ( umur<=17) {
             System.out.println("remaja");
        } else {
            System.out.println("Dewasa");
        }
        
     }

    
