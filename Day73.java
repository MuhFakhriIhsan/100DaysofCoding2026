import java.util.Scanner;

public class Day73 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		System.out.println("DAFTAR MENU GAME");
		
		System.out.println("1. Bermain");
		System.out.println("2. Pengaturan");
		System.out.println("3. Keluar");
		
		do {
			
			a = in.nextInt();
			
			if ( a == 1) {
				System.out.println("Masuk");
				System.out.println("Survival");
				System.out.println("Multiplayer");
				} else if ( a==2) {
					System.out.println("Bahasa");
					System.out.println("Volume");
					System.out.println("Kecerahan");
					} else if (a ==3){
						System.out.println("Keluar");
						} else {
							System.out.println("Tidak valid");
							}
			
			
			
			} while ( a !=3) ;
	}
}
