import java.util.Scanner;
public class Spekulasi_1402022066 {
    public static void main(String[] args) {             //#antiplagiat
        Scanner scan = new Scanner(System.in);           //variabel scan untuk kebutuh input
        int pilihProgram;
        double persentase, perkalian;  //variabel integer untuk kebutuhan program
        String[] pilihanProgram = {"1. Menghitung Persentase ", "2. Menyatakan Bilangan Prima"};    //String Array untuk for each
        System.out.println("=============================================");
        System.out.println("-------------Program Spekulasi---------------");
        System.out.println("--------I Komang Abimanyu/1402022066---------");    //I Komang Abimanyu/1402022066
        System.out.println("=============================================");
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();                  //deklarasi string untuk input nama
        System.out.print("Masukkan Angka: ");
        int angka = scan.nextInt();                     //deklarasi int untuk input angka
        System.out.println("Selamat Datang " + nama);
        System.out.println("Pada Program Spekulasi");
        for (String pilih : pilihanProgram) {       //foreach
            System.out.println(pilih);
        }
        System.out.print("Pilih Program: ");
        pilihProgram = scan.nextInt();

        switch (pilihProgram) {
            case 1:
            System.out.println("Program menghitung persentase masukan pengguna");
            System.out.println("Lalu mengkalikan masukan dengan angka kedua");
            System.out.println("Angka saat ini: " + angka);
            System.out.print("Persentase yang diinginkan: ");
            persentase = scan.nextDouble();
            double hasilPersen = hitungPersentase(angka, persentase); //inisialiasi int untuk hasil persen dan menggukanakan method 
            System.out.println("Angka setelah dipersentase: " + (int)hasilPersen);
            System.out.print("Angka perkalian: ");
            perkalian = scan.nextDouble();
            hitungPerkalian(hasilPersen, perkalian); //memanggil method void hasil perkalian
                break;
            case 2: 
            System.out.println("Program mencari tahu apakah angka pengguna");
            System.out.println("Merupakan sebuah bilangan prima, lalu memodulo bilangannya");
            System.out.println("Dengan angka 2");
            System.out.println("Angka saat ini: " + angka); 
            boolean hasil = cekPrima(angka);        //inisialiasi boolean untuk hasil cekPrima dan menggukanakan method
            System.out.println("Angka merupakan bilangan prima: " + hasil);
            System.out.println("Angka dimodulo 2 adalah: " + (angka % 2));
                break;
            default:
                System.out.println("Tidak ada program tersebut");
        }
        System.out.println("Program berhenti....");
    } // all method dibawah ini
    public static double hitungPersentase(double angkaMasuk, double persen) { //method hitungPersentase
        double angka = angkaMasuk * persen / 100;  //double rumus method
        return Math.round(angka);
    }
    public static void hitungPerkalian(double hasilKali, double kali) {      //method hitungPerkalian
        double result = hasilKali * kali;        //double rumus method
        System.out.println("Angka setelah dikalikan: " + (int)result);
    }
    public static boolean cekPrima(int n) {     //method cekPrima
        if (n < 2 || n == 100000001)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false; 
        return true;
    }
}