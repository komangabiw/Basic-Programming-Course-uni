import java.util.Scanner;
public class MoneyChanger_1402022066{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //memanggil kelas Scanner
        String nama, gender;                    //deklarasi variabel String untuk input
        int umur, uangAnda, tukarUang;          //deklarasi variabel int untuk input
        double jumlahUang = 0;                  //deklarasi variabel double untuk input
        double[][] kurs = {{1, 0.0003, 0.000064, 0.000065}, {3306, 1, 0.21, 0.21}, {15698, 4.75, 1, 1.02}, {15416, 1.02, 4.66, 1}}; //inisialisasi nested array untuk kebutuhan program    
        String[] kursNegara = {"IDR", "RM", "USD", "EURO"}; //inisialisasi array untuk kebutuhan program
        String[] logoKurs = {"Rp.", "RM", "$", "EURO"};     //inisialisasi array untuk kebutuhan program
        System.out.println("Created by I Komang Abimanyu/1402022066");//I Komang Abimanyu/1402022066
        System.out.println("DATA DIRI");
        System.out.print("Masukkan nama Anda: ");
        nama = scan.next();
        System.out.print("Masukkan umur Anda: ");
        umur = scan.nextInt();
        System.out.print("Masukkan gender Anda (L/P): ");
        gender = scan.next();
        
        switch (gender){
            case "L": case "l":
            nama = "Tn. " + nama; break;
            case "P": case "p":
            nama = "Ny. " + nama; break;
        }

        System.out.println("Selamat Datang " + nama);
        System.out.println("============");

        if(umur > 18){
            System.out.println("List Mata Uang:");
            System.out.println("1. IDR");
            System.out.println("2. RM");
            System.out.println("3. USD");
            System.out.println("4. EURO");
            System.out.print("Pilih mata uang yang Anda miliki: ");
            uangAnda = scan.nextInt();          
            if(uangAnda < 5){
                System.out.print("Masukkan jumlah uang yang ingin Anda tukar: " + logoKurs[uangAnda -1] + " ");
                jumlahUang = scan.nextDouble();
                System.out.println("=====" + kursNegara[uangAnda - 1] +"=====");
                System.out.println("List Mata Uang yang dapat ditukar:");
                System.out.println("1. IDR");
                System.out.println("2. RM");
                System.out.println("3. USD");
                System.out.println("4. EURO");
                System.out.print("Pilih mata uang yang ingin anda tukar: ");
                tukarUang = scan.nextInt();
                    switch (uangAnda) {
                        case 4:
                        System.out.println("Uang anda: " + jumlahUang + " " +kursNegara[uangAnda - 1]);    
                            break;                   
                        default:
                        System.out.println("Uang anda: " + kursNegara[uangAnda - 1] + " " +jumlahUang);
                            break;
                    }
                double hasilTukar = jumlahUang * kurs[uangAnda - 1][tukarUang -1];      //inisialisi variabel baru untuk keluaran hasilTukar
                System.out.println("=====Proses====");
                    switch (tukarUang) {
                        case 4:
                        System.out.println("Hasil tukar uang dari " + kursNegara[uangAnda - 1] + " ke " + kursNegara[tukarUang - 1] + " adalah: " + (float)hasilTukar + " " + logoKurs[tukarUang - 1]) ;                                
                            break;                  
                        default:
                        System.out.println("Hasil tukar uang dari " + kursNegara[uangAnda - 1] + " ke " + kursNegara[tukarUang - 1] + " adalah: " + logoKurs[tukarUang - 1] + " " + (float)hasilTukar);
                            break;
                    }
                //System.out.println("Hasil tukar uang dari " + kursNegara[uangAnda - 1] + " ke " + kursNegara[tukarUang - 1] + " adalah: " + logoKurs[tukarUang - 1] + " " + (float)hasilTukar);
                System.out.println("Terima Kasih sudah menggunakan Program Money Changer.");
            }else{
                System.out.println("Maaf Mata Uang Yang Anda Pilih Belum Tersedia");
            }
        }else{
            System.out.println("Umur Anda Tidak Cukup Untuk Melanjutkan Program.");
        }
    }
}