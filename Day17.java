import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan nilai awal\t : ");
		int A = in.nextInt();
		
		System.out.print("angka untuk +\t\t : ");
		A += in.nextInt();
    System.out.printf("Setelah +=\t\t : %d%n " , A);
		
    System.out.print("angka untuk -\t\t : ");
		A -= in.nextInt();
		System.out.printf("Setelah -=\t\t : %d%n " , A);
			
		System.out.print("angka untuk *\t\t : ");
		A *= in.nextInt();
		System.out.printf("Setelah *=\t\t : %d%n " , A);
		
		System.out.print("angka untuk /\t\t :");
		A /= in.nextInt();
		System.out.printf("Setelah /=\t\t : %d%n " , A);
		
		System.out.print("angka untuk %\t\t :");
		A %= in.nextInt();
		System.out.printf("Setelah %%\t\t : %d " , A);
	}
}
