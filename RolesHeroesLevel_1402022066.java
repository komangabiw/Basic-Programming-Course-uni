import java.util.Arrays;
import java.util.Scanner;
public class RolesHeroesLevel_1402022066 {
    public static void main(String[] args) {            
        String[][] heroes = {{"Granger", "Brody"}, {"Tigreal", "Grock"}, {"Selena", "Mathilda"}};   //deklarasi multidimensi array string untuk kebutuhan program
        String[] roles = {"MARKSMAN", "TANK", "MAGE"};                                              //deklarasi array string untuk kebutuhan program
        String[] roleAndHero = new String[2];                                                       //inisialisasi  array string untuk kebutuhan program
        int[][] statusRole = {{30, 15, 30}, {10, 40, 35}, {60, 25, 25}};                            //deklarasi multidimensi array int untuk kebutuhan program
        String inputRole, cekStat;                                                                  //inisialisasi variabel string untuk kebutuhan program
        int pilihHero, upLevel, triggerArray = 0;                                                   //inisialisasi variabel int untuk kebutuhan program
        Scanner scan = new Scanner(System.in);                                                      //memanggil kelas scanner

        System.out.println("============------------------------------------============");   
        System.out.println("Selamat Datang diprogram pemilihan Role Hero Mobile Legends");   
        System.out.println("Dibuat Oleh: I Komang Abimanyu/1402022066");    //I Komang Abimanyu/1402022066   
        System.out.println("============------------------------------------============");   
        System.out.println("Daftar Role yang tersedia: ");   
        System.out.println("1. Marksman");   
        System.out.println("2. Tank");   
        System.out.println("3. Mage");   
        System.out.print("Masukan Role yang diinginkan -> ");
        inputRole = scan.next();    
        if(inputRole.equalsIgnoreCase("Marksman")) {
            triggerArray = 0;
            roleAndHero[0] = roles[0];
        }else if (inputRole.equalsIgnoreCase("Tank")) {
            triggerArray = 1;
            roleAndHero[0] = roles[1];
        }else if (inputRole.equalsIgnoreCase("Mage")) {
            triggerArray = 2;
            roleAndHero[0] = roles[2];
        }
        if((inputRole.equalsIgnoreCase("Marksman")) || (inputRole.equalsIgnoreCase("Tank")) || (inputRole.equalsIgnoreCase("Mage"))){
            System.out.println("---------------------------------------------------");
            System.out.println("Hero yang tersedia adalah: " + Arrays.deepToString(heroes[triggerArray]));
            System.out.print("Pilih Hero -> ");
            pilihHero = scan.nextInt();
            if(pilihHero == 1 || pilihHero == 2){
                roleAndHero[1] = heroes[triggerArray][pilihHero - 1].toUpperCase();
                System.out.println("---------------------------------------------------");
                System.out.println("Ini adalah Role beserta Hero yang anda pilih: ");
                System.out.println(Arrays.toString(roleAndHero));
                System.out.println("Berikut adalah statistik dari Hero anda pada level 1: ");
                System.out.println("Damage	---> " + statusRole[triggerArray][0]);
                System.out.println("Defence	---> " + statusRole[triggerArray][1]);
                System.out.println("Speed	---> " + statusRole[triggerArray][2]);
                System.out.println("---------------------------------------------------");
                System.out.print("Apakah anda ingin mengecek statistik Hero pada level tertentu? (Y/N) >> ");
                cekStat = scan.next();
                if(cekStat.equalsIgnoreCase("y")){
                    System.out.println("Level maksimal adalah 15");
                    System.out.print("Masukan level yang ingin di tinjau -> ");
                    upLevel = scan.nextInt();
                    if(upLevel > 1 && upLevel<=15){
                        System.out.println("Damage	---> " + (statusRole[triggerArray][0] + (5 * (upLevel - 1))));
                        System.out.println("Defence	---> " + (statusRole[triggerArray][1] + (5 * (upLevel - 1))));
                        System.out.println("Speed	---> " + (statusRole[triggerArray][2] + (5 * (upLevel - 1))));
                        System.out.println("Terima kasih Sudah menggunakan program ini :)");
                    }else if(upLevel == 1){
                        System.out.println("Level yang anda pilih informasi nya sudah ada di atas tuhhh");
                    }else{
                        System.out.println("Level yang anda pilih tidak ada!");
                    }
                }else if(cekStat.equalsIgnoreCase("n")){
                    System.out.println("Terima kasih Sudah menggunakan program ini :)");
                }else{
                    System.out.println("Input tidak sesuai!");
                }
            }else{
                System.out.println("Maaf Hero yang anda pilih tidak ada!");
            }
        }else{
            System.out.println("Maaf Role yang anda pilih tidak ada!");
        }   
    }
}