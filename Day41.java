import java.util.Scanner;
    
public class Day41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan suhu :");
        int suhu = in.nextInt();

        if ( suhu < 20 ){
            System.out.println("Ruangan suhu dingin");
        } else if ( suhu >= 20 && suhu <= 28){
            System.out.println("Ruangan suhu normal");
        } else {
            System.out.println("Ruangan suhu panas");
        }
    }

}
