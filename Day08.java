public class Main {
	public static void main(String[] args) {
		
		// Deklarasi = proses mengenalkan nama variabel beserta tipe datanya kepada program
		
		String nama, game ;
		int umur, tahun ;
		
		// Inisialisasi = proses memberikan nilai pertama (nilai awal) pada variabel yang sudah dideklarasikan
		
		nama = "fahri";
		game = "FF";
		umur = 13;
		tahun = 2020;
		
		
		System.out.println("==DATA AWAL==");
		System.out.println("Nama : " + nama);
		System.out.println("Game : " + game);
		System.out.println("Umur : " + umur);
		System.out.println("Tahun : " + tahun);
		
		// Update variabel = proses mengubah atau memperbarui nilai yang tersimpan di dalam variabel dengan nilai yang baru
		
		nama = "Fakhri";
		game = "ML";
		umur = 19;
		tahun = 2026;
		
		System.out.println("\n==SETELAH UPDATE==");
		System.out.println("Nama : " + nama);
		System.out.println("Game : " + game);
		System.out.println("Umur : " + umur);
		System.out.println("Tahun : " + tahun);
	}
	
}
