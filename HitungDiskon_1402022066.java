public class HitungDiskon_1402022066{
	public static void main(String[] args){
		System.out.println("--------------------------------------------------");
		System.out.println("               Program HITUNG DISKON              ");
		System.out.println("      Dibuat oleh I Komang Abimanyu/1402022066    "); //Dibuat oleh I Komang Abimanyu/1402022066
		System.out.println("--------------------------------------------------");
				
		String namaBaru = args[0];  										//menyimpan argumen ke variabel baru untuk mempermudah mencari char pada tengah String
		String acakAdul = namaBaru.substring(2) + namaBaru.substring(0, 2);	//menyimpan argumen ke variabel baru untuk mempermudah mencari char pada tengah String	
		char setdiskon1 = namaBaru.charAt(namaBaru.length()/2);				//mencari char untuk mencari diskon1
		int hargaBaru = Integer.parseInt(args[2]); 							//menyamakan semua tipe data menjadi integer untuk mencari hasil
		int diskon1 = (int)(setdiskon1/3);									//menyamakan semua tipe data menjadi integer untuk mencari hasil	
		int diskon2 = namaBaru.length();									//menyamakan semua tipe data menjadi integer untuk mencari hasil
		int totalDiskon = diskon1 + diskon2;								//menyamakan semua tipe data menjadi integer untuk mencari hasil
		int afterDiskon = 100-totalDiskon;									//menyamakan semua tipe data menjadi integer untuk mencari hasil		
		long totalHarga = (long)afterDiskon*(long)hargaBaru/100;			//untuk memenuhi permintaan output pada soal yg nilainya melebihi kapasitas integer, maka saya pilih long untuk menampung nilai yang lebih besar	
		long sisaDuit = (int)hargaBaru - totalHarga;						//untuk memenuhi permintaan output pada soal yg nilainya melebihi kapasitas integer, maka saya pilih long untuk menampung nilai yang lebih besar
		
		System.out.println("Nama              : " + args[0] );
		System.out.println("Acak Nama         : " + acakAdul);
		System.out.println("Jumlah Karakter   : " + namaBaru.length());
		System.out.println(args[0] + " ingin membeli " + args[1] + " dengan harga Rp." + args[2] + ", beruntungnya hari ini ada diskon besar-besaran.");
		System.out.println("Untuk produk yang ingin dibeli " + args[0] + " mendapatkan potongan sebesar " + diskon1 + "%" + " + " + diskon2 + "%");
		System.out.println("Jadi Total yang harus dibayarkan adalah Rp." + totalHarga);
		System.out.println("Sisa uang Kini Rp." + sisaDuit);
	}
}