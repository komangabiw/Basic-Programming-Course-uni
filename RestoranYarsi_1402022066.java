import java.util.Scanner;

public class RestoranYarsi_1402022066{
	public static void main(String[] args){
	
	int uangAwal = Integer.parseInt(args[0]);	//string parse to int
	String[][] menu = {{"Soto Lamongan", "Pempek Palembang", "Kerang Hijau", "Bubur Ayam Cirebon"}, {"Jeruk", "Stroberi", "Mangga"}, {"Coca Cola", "Fanta", "Sprite"}}; //inisialsasi multidimensi array menu
	int[][] harga   = {{25000, 48000, 15000, 15000}, {12000, 15000, 16000}, {10000, 11000, 9000}};//inisialsasi multidimensi array harga
	Scanner scan = new Scanner(System.in);			//Memanggil kelas scanner
	int pilihMenu, pilihMenuMakan, pilihMenuMinum, jumlahMakanan, jumlahMinuman , pilihJus, pilihSoftDrink; //deklarasi variabel untuk input
				
	System.out.println("==============================================================");
	System.out.println("---------------Selamat Datang Di Restoran Yarsi---------------");
	System.out.println("-----------------I Komang Abimanyu/1402022066-----------------");//Dibuat oleh I Komang Abimanyu/1402022066
	System.out.println("==============================================================");
	
	if(uangAwal >= 9000){
		System.out.println("Menu kami terdiri dari:");
		System.out.println("1. Makanan");
		System.out.println("2. Minuman");
		System.out.print("Pilih Menu(1/2): ");
		pilihMenu = scan.nextInt();
		System.out.println("==============================================================");
		if(pilihMenu == 1){
			System.out.println("Makanan :");
			System.out.println("1. Soto Lamongan");
			System.out.println("2. Pempek Palembang");
			System.out.println("3. Kerang Hijau");
			System.out.println("4. Bubur Ayam Cirebon");
			System.out.print("Silahkan pilih pesanan: ");
			pilihMenuMakan = scan.nextInt();
			System.out.println("==============================================================");
			if(pilihMenuMakan < 5){
				System.out.println("Anda memesan Makanan " + menu[pilihMenu-1][pilihMenuMakan-1]);
				System.out.print("Berapa jumlah yang ingin Anda pesan? ");
				jumlahMakanan = scan.nextInt();
				System.out.println("Jumlah Uang Anda: " + uangAwal);
				int hargaMakananDalem = jumlahMakanan *  harga[pilihMenu-1][pilihMenuMakan-1];
				System.out.println("Total harga yaitu: " + hargaMakananDalem);
				if(uangAwal >= hargaMakananDalem){
					System.out.println("Sisa Uang Anda: " + (uangAwal - hargaMakananDalem));
				}else{
					System.out.println("Maaf Uang Anda Tidak Cukup Untuk Melakukan Pembayaran");
				}
			}else{
				System.out.println("Maaf Menu Yang Anda Pilih Belum Tersedia");
			}
		}else if(pilihMenu == 2){
			System.out.println("Jenis Minuman :");
			System.out.println("1. Jus");
			System.out.println("2. Soft Drink");
			System.out.print("Silahkan pilih pesanan: ");
			pilihMenuMinum = scan.nextInt();
			System.out.println("==============================================================");
			if(pilihMenuMinum == 1){
				System.out.println("Jenis Jus :");
				System.out.println("1. Jeruk");
				System.out.println("2. Stroberi");
				System.out.println("3. Mangga");
				System.out.print("Silahkan pilih pesanan: ");
				pilihJus = scan.nextInt();
				System.out.println("==============================================================");
				if(pilihJus < 4){
					System.out.println("Anda memesan Jus " + menu[pilihMenuMinum][pilihJus-1]);
					System.out.print("Berapa jumlah yang ingin Anda pesan? ");
					jumlahMinuman = scan.nextInt();
					System.out.println("Jumlah Uang Anda: "  + uangAwal);
					int hargaMinumanDalem = jumlahMinuman *  harga[pilihMenuMinum][pilihJus-1];
					System.out.println("Total harga yaitu: " + hargaMinumanDalem);
					if(uangAwal >= hargaMinumanDalem){
					System.out.println("Sisa Uang Anda: " + (uangAwal - hargaMinumanDalem));
					}else{
					System.out.println("Maaf Uang Anda Tidak Cukup Untuk Melakukan Pembayaran");
					}
				}else{
				System.out.println("Maaf Menu Yang Anda Pilih Belum Tersedia");
				}
			}else if(pilihMenuMinum == 2){
				System.out.println("Jenis Soft Drink :");
				System.out.println("1. Coca cola");
				System.out.println("2. Fanta");
				System.out.println("3. Sprite");
				System.out.print("Silahkan pilih pesanan: ");
				pilihSoftDrink = scan.nextInt();
				System.out.println("==============================================================");
				if(pilihSoftDrink < 4){
					System.out.println("Anda memesan " + menu[pilihMenuMinum][pilihSoftDrink-1]);
					System.out.print("Berapa jumlah yang ingin Anda pesan? ");
					jumlahMinuman = scan.nextInt();
					System.out.println("Jumlah Uang Anda: "  + uangAwal);
					int hargaMinumanDalem = jumlahMinuman *  harga[pilihMenuMinum][pilihSoftDrink-1];
					System.out.println("Total harga yaitu: " + hargaMinumanDalem);
					if(uangAwal >= hargaMinumanDalem){
					System.out.println("Sisa Uang Anda: " + (uangAwal - hargaMinumanDalem));
					}else{
					System.out.println("Maaf Uang Anda Tidak Cukup Untuk Melakukan Pembayaran");
					}
				}else{
				System.out.println("Maaf Menu Yang Anda Pilih Belum Tersedia");
				}
			}else{
				System.out.println("Maaf Jenis Minuman Yang Anda Pilih Belum Tersedia");
			}
		}else{ 
			System.out.print("Maaf Menu Yang Anda Pilih Belum Tersedia");
		}
	}else System.out.println("Maaf Uang Anda Belum Cukup");
	}
}