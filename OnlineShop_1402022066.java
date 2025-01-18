import java.util.Scanner;
public class OnlineShop_1402022066 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        System.out.println("------------Program Online Shop----------");
        System.out.println("Dibuat Oleh  I Komang Abimanyu/1402022066");//I Komang Abimanyu/1402022066
        System.out.println("-----------------------------------------");
        Scanner scan = new Scanner(System.in);  //scan untuk input
        boolean condition = true;               //boolean untuk kondisi awal while
        String[] listItem = new String [1];     //array temp
        int[] listHarga = new int [1];          //array temp
        while (condition) {
            System.out.println("Pilihan: ");
            System.out.println("1. Mengisi Keranjang");
            System.out.println("2. Filter mengeja item");
            System.out.println("3. Filter item sesuai Harga (Terendah - tertinggi)");
            System.out.println("4. Filter item sesuai Harga (Tertinggi - terendah)");
            System.out.print("Silahkan pilih menu: ");
            int pilih = scan.nextInt();                         //input untuk pilih menu
            if (pilih == 1) {
                System.out.print("Jumlah item yang akan diCheckOut: ");
                int Jumlah = scan.nextInt();                    //input berapa barang yg mau di checkout
                System.out.println("---------------------------------------");
                System.out.println("Silahkan isi keranjang untuk diCheckOut");
                System.out.println("---------------------------------------");
                String[] listItemBaru = new String [Jumlah];    //membuat array baru dengan panjang dari input
                int[] listHargaBaru = new int [Jumlah];         //membuat array baru dengan panjang dari input
                listItem = listItemBaru;
                listHarga = listHargaBaru;
                int nomer = 1, nomer2 = 1;                      //untuk mengurutkan angka awal
                for (int i = 0; i < Jumlah; i++) {
                    System.out.print("Item " + nomer + ": ");
                    String item = scan.next();              //input item dan dimasukkan ke array
                    listItem[i] = item;
                    System.out.print("Harga: ");
                    int harga = scan.nextInt();             //input harga item dan dimasukkan ke array
                    listHarga[i] = harga;
                    nomer++;
                }
                System.out.println("Total Item: " + listHargaBaru.length);
                System.out.println("List item: ");
                for (int i = 0; i < listHarga.length; i++) {
                    System.out.println(nomer2 + "." + listItem[i] + " & "  +listHarga[i]);
                    nomer2++;
                }
            } else if (pilih == 2){
                for (int i = 0; i < listItem.length; i++) {
                    System.out.println((i+1) + "." + listItem[i]);
                }
                System.out.print("Pilih barang yang ingin di eja? ");
                int eja = scan.nextInt();                       //input untuk memilih kalimat mana yang di eja
                System.out.println("List mengeja item:");
                // String ejainDong  = listItem[eja-1];            //variabel string yang menampung nilai dari array untk di eja
                // for (int i = 0; i < ejainDong.length(); i++) {
                //     System.out.println((i+1) + "." + ejainDong.charAt(i));
                // }
                char[] ejainDongChar = listItem[eja - 1].toCharArray();
                int mulai = 1;
                for (char tes : ejainDongChar)
                    System.out.println((mulai++) + "." + tes);
            } else if (pilih == 3){   //dari kecil ke besar
                for(int j=0; j<listHarga.length-1; j++){  
                    for(int i=0; i<listHarga.length-1; i++){
                        if (listHarga[i] > listHarga[i+1]){
                            int temp = listHarga[i+1];              //variabel untuk menampung nilai sementara
                            listHarga[i+1] = listHarga[i];
                            listHarga[i] = temp;
                            String tempList = listItem[i+1];        //variabel untuk menampung nilai sementara
                            listItem[i+1] = listItem[i];
                            listItem[i] = tempList;
                        }
                    }
                }
                int nomer = 1;//untuk mengurutkan angka awal
                for (int i = 0; i < listHarga.length; i++) { //print dari kecil ke besar
                    System.out.println(nomer + "." + listItem[i] + " & "  +listHarga[i]);
                    nomer++;
                }
            } else if (pilih == 4){ //dari besar ke kecil
                for(int j=0; j<listHarga.length-1; j++){  
                    for(int i=0; i<listHarga.length-1; i++){
                        if (listHarga[i] < listHarga[i+1]){
                            int temp = listHarga[i+1];              //variabel untuk menampung nilai sementara
                            listHarga[i+1] = listHarga[i];
                            listHarga[i] = temp;
                            String tempList = listItem[i+1];        //variabel untuk menampung nilai sementara
                            listItem[i+1] = listItem[i];
                            listItem[i] = tempList;
                        }
                    }
                }
                int nomer = 1; //untuk mengurutkan angka awal
                for (int i = 0; i < listHarga.length; i++) { //print dari besar ke kecil
                    System.out.println(nomer + "." + listItem[i] + " & "  + listHarga[i]);
                    nomer++;
                }
            } else 
                System.out.println("Anda belum mengisi keranjang segera isi keranjang sekarang juga");
            System.out.print("Apakah anda ingin melanjutkan (y/t)? ");
            String out = scan.next();   //variabel untuk mengulang program/tidak
            if(!out.equalsIgnoreCase("Y"))
                condition = false;
        }
        System.out.println("Terima kasih sudah menggunakan program ini");
    }
}