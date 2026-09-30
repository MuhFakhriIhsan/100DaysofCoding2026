import java.util.Scanner;

public class Day29 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.print("Masukkan nilai A :");	
		int A = in.nextInt();
		System.out.print("Masukkan nilai B :");
		int B = in.nextInt();
		
		System.out.println("Operator < : " + (A <B));
		System.out.println("Operator > : " + (A>B));
	}
}
