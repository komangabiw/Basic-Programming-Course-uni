	 import java.util.Scanner;

public class PendaftaranBantuanSosial_1402022066{
	public static void main(String[] args){
	String nama = args[0];									//untuk menyimpan argumen ke String 
	String tLahir = args[1];								//untuk menyimpan argumen ke String 
	String namaDom = args[2];								//untuk menyimpan argumen ke String 		
	String subLahir = tLahir.substring(0,2);				//substring untuk mengambil nilai acak untuk dijadikan kode ID
	String duaKarakter = nama.substring(nama.length()-2);	//substring untuk mengambil nilai acak untuk dijadikan kode ID
	char karakter1 = namaDom.charAt(0);						//mencari character untuk dijadikan kode ID
	int duaAngka = Integer.parseInt(subLahir);				//mencari 2 angka untuk dijadikan kode ID
	int kodeDua = ((duaAngka + 7 )% 5);						//mencari 2 angka untuk dijadikan kode ID
	
	System.out.println("============================================");
	System.out.println("--------I Komang Abimanyu/1402022066--------"); //Dibuat oleh I Komang Abimanyu/1402022066
	System.out.println("-----Program Pendaftaran Bantuan Sosial-----");
	System.out.println("============================================");
	System.out.println("Masukan nama                 : " + args[0]);
	System.out.println("Masukan tanggal lahir        : " + args[1]);
	System.out.println("Masukan domisili             : " + args[2]);
	System.out.println("Berikut ID pendaftaran anda  : " + karakter1 + kodeDua + duaKarakter);
	System.out.println("============================================");	
	
	Scanner scan = new Scanner(System.in);					//untuk menambah input
	String tes1,tes2,tes3,tes4,tes5;						//variabel untuk input
	System.out.println("Jawablah pertanyaan dibawah ini dengan Ya/Tidak!");	
	System.out.print("Apakah anda seorang WNI?                           : ");
	tes1 = scan.next();
	System.out.print("Apakah anda seorang ASN (Aparatur Sipil Negara)?   : ");
	tes2 = scan.next();
	System.out.print("Apakah anda korban PHK (Pemutusan Hubungan Kerja)? : ");
	tes3 = scan.next();
	System.out.print("Apakah anda memiliki penyakit?                     : ");
	tes4 = scan.next();
	System.out.print("Masukan jumlah penghasilan anda dalam satu bulan   : Rp. ");
	tes5 = scan.next();
	System.out.println("============================================");
	
	String[] tampung = new String[5];						//array untuk menampung nilai input
	tampung[0] = tes1;
	tampung[1] = tes2;
	tampung[2] = tes3;
	tampung[3] = tes4;
	tampung[4] = tes5;
	int stringUang = Integer.parseInt(tampung[4]);			//integer untuk mengambil array di elemen terakhir karena bernilai int untuk dijadikan hasil akhir
	
	boolean[] tesTampung = new boolean[5];					//array boolean untuk menampung hasil perbandingan array awal dengan ignorecase "YA"
	tesTampung[0] = tampung[0].equalsIgnoreCase("YA");
	tesTampung[1] = tampung[1].equalsIgnoreCase("YA");
	tesTampung[2] = tampung[2].equalsIgnoreCase("YA");
	tesTampung[3] = tampung[3].equalsIgnoreCase("YA");
	
	boolean sembako = tesTampung[0] && !tesTampung[1] && (tesTampung[2] || (stringUang < 600000));		//rumus untuk mencari hasil
	boolean uang 	= tesTampung[0] && !tesTampung[1] && tesTampung[2] && (stringUang < 600000);		//rumus untuk mencari hasil
	boolean obat	= tesTampung[0] && tesTampung[3];													//rumus untuk mencari hasil
	
	System.out.println("Mendapatkan bantuan sembako             : " + sembako);
	System.out.println("Mendapatkan bantuan uang Rp. 5.000.000  : " + uang);
	System.out.println("Mendapatkan bantuan obat-obatan         : " + obat);	
	}
}