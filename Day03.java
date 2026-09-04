public class Main{
	public static void main(String[] args){
		
		//Penggunaan escape sequence
		
		String nama = ("fahri");
		int umur = 19;
		String hobi = ("main emel");
		
		// \n : untuk pindah ke garis baru
		
		System.out.println("nama saya :fahri\n umur saya :19 \n hobi saya :main emel");
		
		// \t : untuk menambahkan spasi rata atau tab
		
		System.out.println("nama : \t " + nama);
		System.out.println("umur : \t " + umur);
		System.out.println("hobi : \t" + hobi);
		
		
		// \b : untuk menghapus 1 karakter sebelumnya
		
		System.out.println("harii\b ini sudah hari ke-3");
		
		// \' dan \" : untuk menampilkan tanda kutip tunggal dan kutip ganda
		
		System.out.print("dan ada yang bertanya tentang \"progres\", jdi saya jawab \'aman' ");
		
	}
	
}
