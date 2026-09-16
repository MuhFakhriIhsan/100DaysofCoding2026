import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int nilai1 = in.nextInt();
		int nilai2 = in.nextInt();
		
		int bagi = nilai1/nilai2;
		int sisa = nilai1%nilai2;
		
		System.out.printf("Hasil bagi = %d %n" , bagi);
		System.out.printf("Sisa bagi = %d " , sisa);
	}
}
