import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nama Lengkap\t : ");
		String nama = in.nextLine();
		
		System.out.print("Tempat Lahir\t : ");
		String tempatLahir = in.nextLine();
		
		System.out.print("Umur\t\t : ");
		int umur = in.nextInt();
		
		System.out.print("Tinggi Badan\t : ");
		double tinggiBadan = in.nextDouble();
		
		System.out.print("Berat Badan\t : ");
		float beratBadan = in.nextFloat();
		
		System.out.print("Jenis Kelamin\t : ");
		char jenisKelamin = in.next().charAt(0);
		
		System.out.print("Semester\t : ");
		byte semester = in.nextByte();
		
		System.out.print("Ipk\t\t : ");
		double ipk = in.nextDouble();
		
		in.nextLine();
			
		System.out.print("Status\t\t : ");
		String status = in.nextLine();
		
		
		
		System.out.println("=============================");
		System.out.println("=     BIODATA MAHASISWA     =");
		System.out.println("=============================");
		
		System.out.printf("Nama Lengkap\t : %s\n " , nama);
		System.out.printf("Tempat Lahri\t : %s\n " , tempatLahir);
		System.out.printf("Umur\t\t : %d tahun\n " , umur);
		System.out.printf("Tinngi Badan\t : %.1f cm\n " , tinggiBadan);
		System.out.printf("Berat Badan\t : %.1f kg\n " , beratBadan);
		System.out.printf("Jenis Kelamin\t : %c\n " , jenisKelamin);
		System.out.printf("Semester\t : %d\n " , semester);
		System.out.printf("IPK\t\t : %.2f\n " , ipk);
		System.out.printf("Status\t\t : %s\n " , status);
		
		System.out.print("=============================");
		
	}
}
