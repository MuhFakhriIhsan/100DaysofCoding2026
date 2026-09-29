import java.util.Scanner;

public class Day28 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan Nilai A :");
		int A = in.nextInt();
		System.out.print("Masukkan Nilai B :");
		int B = in.nextInt();
		
		System.out.println("Menggunakan operator == : " + (A == B));
		System.out.println("Menggunakan operator != : " + (A != B));
	}
}
