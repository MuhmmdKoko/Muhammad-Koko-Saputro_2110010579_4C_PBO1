package pbo;

import java.util.Scanner;

public class kodeBanJalan {
    public static void main(String[] args) {
        //error handling dengan try dan catch
        try{
            //io sederhana menggunakan scanner
            Scanner scanner = new Scanner(System.in);

            //array
            bacaKodeBan[] ban = new bacaKodeBan[3];

            //perulangan
            for(int i=0; i<ban.length; i++){
                System.out.println("Masukkan Merek Ban "+(i+1)+": ");
                String merek = scanner.nextLine();
                System.out.println("Masukkan Kode Ban "+(i+1)+": ");
                String kode = scanner.nextLine();
                
            //objek
            ban[i] = new bacaKodeBan(merek, kode);
            }

            //perulangan
            for(bacaKodeBan data: ban){
                System.out.println("================");
                System.out.println("Data Profil Ban: ");
                System.out.println(data.displayInfo());
            }
        } catch (NumberFormatException e) {
                System.out.println("Kesalahan Format Nomor: "+e.getMessage());    
        } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Kesalahan Format Kode Pada Ban: "+e.getMessage());
        } catch (Exception e) {
                System.out.println("Kesalahan Umum: "+e.getMessage());
        }
    }
}