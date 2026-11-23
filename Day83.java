import java.util.Scanner;

public class Day83 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int []angka = new int[2];
		int jumlah = 0;
		
		for (int a = 0; a < angka.length; a++){
			angka[a] = in.nextInt();
			jumlah += angka[a];
			
			}
			System.out.println("Hasil Jumlah = " + jumlah);
	}
}
