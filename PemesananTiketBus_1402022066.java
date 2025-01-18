import java.util.Scanner;
public class PemesananTiketBus_1402022066 {
    public static void main(String[] args) {
        //#antiplagiat
        Scanner scan = new Scanner(System.in);                                                     //variabel scan untuk kebutuh input
        int kelasTiket, pilihTujuan, jamBerangkat, jumlahPenumpang, penumpang = 1, trigger = 0;    //variabel integer untuk kebutuhan program
        String nama, kursiPenumpang;                                                               //variabel String untuk kebutuhan program
        String[] tujuan = {"Jakarta Brebes", "Wonosobo Yogyakarta", "Magelang Madiun"};            //String Array untuk tujuan
        String[] kelasBus = {"1. Kelas Ekonomi", "2. Kelas Ekspres"};                              //String Array untuk for each
        String[] jam = {"0800", "1230", "0320"};                                                   //String Array untuk kode tujuan
        String[] kodeTujuan = {"JAKBRE", "WONYOG", "MAGMAD"};                                      //String Array untuk kode tujuan
        String[] tujuanBerangkat = {"Jakarta-Brebes", "Wonosobo-Yogyakarta", "Magelang-Madiun"};   //String Array untuk tujuan penumpang      
        System.out.println("===========================================");  
        System.out.println("Selamat Datang di Program Pemesan tiket Bus");
        System.out.println("Dibuat oleh  [I Komang Abimanyu/1402022066]"); //I Komang Abimanyu/1402022066
        System.out.println("===========================================");
        System.out.println("Pilih kelas tiket Buss");
        for (String kelas : kelasBus) {
            System.out.println(kelas);
        }
        System.out.print("Pilih kelas tiket: ");
        kelasTiket = scan.nextInt();
        if (kelasTiket == 1 || kelasTiket == 2) {
            System.out.println("Pilih tujuan keberangkatan");
            System.out.println("1. Jakarta - Brebes");
            System.out.println("2. Wonosobo - Yogyakarta");
            System.out.println("3. Magelang - Madiun:");
            System.out.print("Pilih tujuan: ");
            pilihTujuan = scan.nextInt();         
            if (pilihTujuan >= 1 && pilihTujuan <=3) {
                System.out.print("Masukan jumlah Anggota penumpang: ");
                jumlahPenumpang = scan.nextInt();
                int copyJumlahPenumpang = jumlahPenumpang;          //membuat variabel copy untuk trigger
                System.out.println("\nAnda memilih tujuan " + tujuan[pilihTujuan - 1]);            
                String[] nomorKursi = new String[jumlahPenumpang], namaPenumpang = new String[jumlahPenumpang], kodeNama = new String[jumlahPenumpang], jamJadwal = new String [jumlahPenumpang];      //new Array untuk kode penumpang
                while (jumlahPenumpang > 0) {
                    System.out.println("\nPendaftaran penumpang ke-" + penumpang++);
                    System.out.print("Masukan nama penumpang: ");
                    nama = scan.next();
                    System.out.print("Masukan kursi Penumpang: ");
                    kursiPenumpang = scan.next(); 
                    nomorKursi[trigger] = kursiPenumpang;   
                    if (trigger >= 1) {         //logic ini saya buat hanya untuk 1 atau 2 penumpang sesuai permintaan kasus uji, agar tidak bisa menempati kursi yang sama
                        for (int i = 0; i < copyJumlahPenumpang-1; i++) {
                            for (int j = 1; j < copyJumlahPenumpang; j++) {
                                while (nomorKursi[i].equalsIgnoreCase(nomorKursi[j])) {
                                    System.out.println("Kursi kamu udah diambil penumpang lain tau");
                                    System.out.print("Masukan kursi Penumpang: ");
                                    kursiPenumpang = scan.next();
                                    nomorKursi[trigger] = kursiPenumpang;
                                    if(!nomorKursi[i].equalsIgnoreCase(nomorKursi[j])){
                                        break;
                                    }
                                }
                            }
                        }
                    }                  
                    System.out.println("Pilih jam keberangkatan:");
                    System.out.println("1. 08.00");
                    System.out.println("2. 12.30");
                    System.out.println("3. 03.20");
                    System.out.print("Pilih jam keberangkatan: ");
                    jamBerangkat = scan.nextInt();
                    if(jamBerangkat == 1){
                        jamJadwal[trigger] = jam[0];
                    }else if(jamBerangkat == 2){
                        jamJadwal[trigger] = jam[1];
                    }else if(jamBerangkat == 3){
                        jamJadwal[trigger] = jam[2];
                    }  
                    namaPenumpang[trigger] = nama; 
                    kodeNama[trigger] = nama.substring(0,1).toUpperCase() + nama.substring(nama.length() - 1).toUpperCase();   
                    jumlahPenumpang--;
                    trigger++;                   
                    if (jumlahPenumpang == 0) {
                        System.out.println("======================================");
                        System.out.println("======Hasil Formulir Pendaftaran======");
                        System.out.println("======================================");
                        System.out.println("Nomor Kursi\t\tNama Penumpang\t\tKode Penumpang\t\tTujuan Penumpang");
                        for (int i = 0; i < copyJumlahPenumpang; i++) {
                            System.out.print(nomorKursi[i] + "\t\t\t" + namaPenumpang[i] + "\t\t\t" + nomorKursi[i]+ "-" + kodeTujuan[pilihTujuan - 1] + "-" + kodeNama[i] + "-" + jamJadwal[i] + "\t" + tujuanBerangkat[pilihTujuan - 1] +"\n");
                        }
                    }
                }
            } else 
                System.out.println("Tidak ada pilihan tujuan tersebut diProgram ini");
        } else 
            System.out.println("Pilihan tiket tidak ada.");
    }
}