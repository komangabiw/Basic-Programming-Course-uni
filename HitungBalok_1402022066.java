public class HitungBalok_1402022066{
	public static void main(String[] args){
		System.out.println("=========Program Perhitungan Balok==========");
		System.out.println("-Dibuat oleh [I Komang Abimanyu/1402022066]-");
		System.out.println("============================================");
		
		//menampung variabel dari args
		float panjang = Float.parseFloat(args[0]);	//dikarenakan bilangan menggunakan koma (.) maka saya menggunakan float
		float lebar = Float.parseFloat(args[1]);	//dikarenakan bilangan menggunakan koma (.) maka saya menggunakan float
		float tinggi = Float.parseFloat(args[2]);	//dikarenakan bilangan menggunakan koma (.) maka saya menggunakan float
			
		//variabel untuk keluaran khusus Luas Permukaan Balok
		float pL = panjang * lebar;		//variabel yang ditampung dari args sudah diubah menjadi float dan terus melanjutkan untuk rumus
		float pT = panjang * tinggi;	//variabel yang ditampung dari args sudah diubah menjadi float dan terus melanjutkan untuk rumus
		float lT = lebar * tinggi;		//variabel yang ditampung dari args sudah diubah menjadi float dan terus melanjutkan untuk rumus
		
		//variabel untuk mengeluarkan nilai dari rumus 
		float volume = panjang * lebar * tinggi;												//pemilihan float dikarenakan dari awal selalu float dan mencari nilai presisi 
		float luasPerm = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));		//pemilihan float dikarenakan dari awal selalu float dan mencari nilai presisi 
		float kelBalok = 4 * (panjang + lebar + tinggi);										//pemilihan float dikarenakan dari awal selalu float dan mencari nilai presisi 
		

		double volumeCast = (double) volume;
			
		System.out.println("Panjang: " + panjang + " cm");
		System.out.println("Lebar: " + lebar + " cm");
		System.out.println("Tinggi: " + tinggi + " cm");		
		System.out.println("-----------------------------------------------");
		System.out.println("               Menunggu Hasil                  ");
		System.out.println("-----------------------------------------------");		
		System.out.println("Volume Balok: " + panjang + " x " + lebar + " x " + tinggi + " = " + (float)volumeCast + "cm^3");
		System.out.println("Luas Permukaan Balok: 2 x (" + pL + " + " + pT + " + " + lT + ")= " + luasPerm + "cm^2");
		System.out.println("Keliling Balok: 4 x (" + panjang + " + " + lebar + " + " + tinggi + ")= " + kelBalok + "cm");
	
	}
}