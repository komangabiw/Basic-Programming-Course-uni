import java.util.*;
import java.util.Scanner;

public class GameSteam_1402022066{
	public static void main(String[] args){
		
		String[] dataGame = {"Left 4 Dead", "CsGo", "Apex Legends", "Outlast", "Pubg", "World War Z", "Assassin's Creed", "Creativers", null, null};//Array untuk menyimpan list dataGame
		
		System.out.println("=================================================");
		System.out.println("--------------Program Store Steam----------------");
		System.out.println("-----------I Komang Abimanyu/1402022066----------");//Dibuat oleh I Komang Abimanyu/1402022066
		System.out.println("=================================================");
		System.out.println("List Game Yang Kamu punya:");
		System.out.println("1. " + dataGame[0]);
		System.out.println("2. " + dataGame[1]);
		System.out.println("3. " + dataGame[2]);
		System.out.println("4. " + dataGame[3]);
		System.out.println("5. " + dataGame[4]);
		System.out.println("6. " + dataGame[5]);
		System.out.println("7. " + dataGame[6]);
		System.out.println("8. " + dataGame[7]);
		System.out.println("=================================================");
		System.out.println("====================List Data====================");
		System.out.println("=================================================");
		
		Scanner scan = new Scanner(System.in);			//Memanggil kelas scanner
		String nama, genre, namaGame;					//untuk menyimpan variabel bernilai String
		int usia, saldo, hargaGame, taroFolder;			//untuk menyimpan variabel bernilai int
		System.out.print("Masukan Nama        : ");		
		nama = scan.next();								//input String
		System.out.print("Usia                : ");
		usia = scan.nextInt();							//input int
		System.out.print("Genre Game          : ");
		genre = scan.next();							//input String
		System.out.print("Nama Game           : ");
		scan.nextLine();								//skip next line
		namaGame = scan.nextLine();						//input String
		System.out.print("Saldo Steam         : ");
		saldo = scan.nextInt();							//input int
		System.out.print("Harga Game          : ");
		hargaGame = scan.nextInt();						//input int					
		
		String[] tampungData = new String[3];			//Array untuk menyimpan variabel String dari input
		tampungData[0] = nama;							//inisiasi isi array
		tampungData[1] = genre;							//inisiasi isi array
		tampungData[2] = namaGame;						//inisiasi isi array
		String kodeID = tampungData[0].substring(0, 1) + nama.charAt(nama.length()/2) + Integer.toString(usia) + tampungData[2].charAt(0) + tampungData[2].charAt(namaGame.length()-1); //rumus kodeID
		String kodeUpper = kodeID.toUpperCase(); 		//untuk membuat upperCase
		
		System.out.println("=================================================");
		System.out.println("Kode Pembayaran     : "  + kodeUpper);
		System.out.println("=================================================");
		System.out.println("Game yang dipilih   : " + namaGame);
		System.out.println("Genre Game          : " + genre);
		System.out.println("=================================================");
		System.out.println("Folder game saat ini:");
		System.out.println(Arrays.toString(dataGame));
		System.out.print("Pilih Folder untuk game Baru berupa angka  : ");
		
		taroFolder = scan.nextInt();										//input int
		dataGame[taroFolder-1] = namaGame;									//inisiasi isi array
		boolean[] hasilData = new boolean[3];								//Array untuk menyimpan variabel boolean untuk menentukan hasil program
		hasilData[0] = false;												//inisiasi awal array untuk kondisi
		if(taroFolder == 9 || taroFolder == 10){							//struktur if untuk penaruhan data di array
			hasilData[0] = true;
		}	
		hasilData[1] = saldo > hargaGame;									//rumus hasil akhir di array
		hasilData[2] = usia > 18;											//rumus hasil akhir di array
		boolean cekSyarat = hasilData[0] && hasilData[1] && hasilData[2];	//rumus hasil akhir di array
		
		System.out.println("list Game :");
		System.out.println(Arrays.toString(dataGame));
		System.out.println("Sudah memasukan game ke folder yang benar? " + hasilData[0]);
		System.out.println("Saldo sudah mencukupi? " + hasilData[1]);
		System.out.println("Usia sudah mencukupi? " + hasilData[2]);		
		System.out.println("\nBerikut hasil pengecekan: " + Arrays.toString(hasilData));
		System.out.println("Sudah memenuhi syarat membeli game? " + cekSyarat);
	}
}