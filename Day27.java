import java.util.Scanner;

public class Day27 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("MASUKKAN ANGKA AWAL : ");
		int A = in.nextInt();
		
		System.out.println("Setelah ++ : " + ++A);
		System.out.println("Setelah -- : " + --A);
		
	}
}
