import java.util.Scanner;
import java.util.Arrays;
public class ManipulasiKalimat_1402022066 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //memanggil kelas scanner
        String inputKalimat, ulang;             //inisialisasi variabel string untuk kebutuhan program
        int pilihOpsi;                          //inisialisasi variabel int untuk kebutuhan program
        System.out.println("============================================");
        System.out.println("--------Program Manipulasi Kalimat----------");
        System.out.println("--Dibuat oleh I Komang Abimanyu/1402022066--");//I Komang Abimanyu/1402022066 
        System.out.println("============================================");
        System.out.println("Selamat datang diprogram Manipulasi Kalimat:");
        System.out.print("Silakan masukan Kalimat: ");
        inputKalimat = scan.nextLine();  
        String hapusSpasi = inputKalimat.replace(" ", ""); //variable string dengan replace, untuk mengubah spasi menjadi tanpa spasi dan untuk dimasukkan ke hasil char untuk case 4
        String[] hasilInput = inputKalimat.split(" ");  //array string untuk memisahkan kalimat setiap bertemu spasi dengan split
        char[] hasilChar = hapusSpasi.toCharArray();  //array char untuk kebutuhan case 4
        System.out.println("pilih menu manipulasi: ");
        System.out.println("1. Urai kalimat menjadi kata ");
        System.out.println("2. Hilangkan spasi ");
        System.out.println("3. Membalikan kalimat ");
        System.out.println("4. Urai kalimat menjadi huruf lalu diurutkan");
        do {       
            System.out.print("Menu pilihan: ");
            pilihOpsi =  scan.nextInt();          
            while (pilihOpsi > 4) {
                System.out.println("Pilihan anda tidak tersedia");
                System.out.println("silahkan pilih ulang!");
                System.out.print("Menu pilihan: ");
                pilihOpsi = scan.nextInt(); 
            }
            if (pilihOpsi == 1) {
                System.out.println("Kalimat \"" + inputKalimat + "\"" + " mengandung " + hasilInput.length + " buah kata");
                System.out.print("Hasil Kalimat yang sudah diurai menjadi kata: " + Arrays.toString(hasilInput));
            } else if (pilihOpsi == 2) {
                System.out.print("Hasil penghapusan spasi: ");
                for (int index = 0; index < inputKalimat.length(); index++) {
                    char hapus = inputKalimat.charAt(index); //temp variabel
                    if (hapus != ' ') {
                        System.out.print(hapus);
                    }
                }
            } else if (pilihOpsi == 3) {
                System.out.println("Kalimat sebelum dibalik: " + inputKalimat);
                System.out.print("Kalimat sesudah dibalik: ");
                for (int index = 1; index < inputKalimat.length() + 1; index++) {
                    char x = inputKalimat.charAt(inputKalimat.length() - index); //temp variabel
                    System.out.print(x);
                }
            } else if (pilihOpsi == 4) {
                System.out.println("Kalimat \"" + inputKalimat + "\"" + " mengandung " + hasilChar.length + " buah huruf");
                System.out.println("Hasil Kalimat yang sudah diurai menjadi huruf: ");
                System.out.println("sebelum diurut:");
                System.out.println(Arrays.toString(hasilChar));
                Arrays.sort(hasilChar); //sort sesuai abjad
                System.out.println("sesudah diurut:");
                System.out.print(Arrays.toString(hasilChar));
            }
        System.out.print("\n\nApakah anda ingin memilih menu lagi (Ya/Tidak) --> ");
        ulang = scan.next();         
        } while (ulang.equalsIgnoreCase("ya"));
       System.out.println("Terimakasih sudah menggunakan program ini \nSampai berjumpa kembali :)");
    }
}