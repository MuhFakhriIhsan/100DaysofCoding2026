public class Main {
	public static void main(String[] args) {
		
		//tipe data karakter (char) dan (boolean)
		
		/**
		
		*char hanya menyimpan 1 karakter dan wajib menggunakan petik tunggal
		
		*boolean hanya berisikan nilai true atau false tanpa tanda petik
		
		*/
		
		String nama = ("fahri");
		char kelas = 'A';
		int nilai = 90;
		boolean statusLulus = (nilai > 75);
		
		System.out.println("HASIL UJIAN");
		System.out.println("Nama : " + nama);
		System.out.println("Kelas : " + kelas);
		
		System.out.println("Nilai : " + nilai);
		System.out.println("dinyatakan lulus !! " + statusLulus);
		
	}
}
