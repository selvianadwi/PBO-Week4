
package week4;

import java.util.Scanner;

public class Konversi{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int detik, sisaDetik, menit, sisaMenit, jam, hari;
        
        do {
            System.out.print("Masukkan jumlah detik: ");
            detik = input.nextInt();
            
            if (detik >= 86400) {
                hari = detik / 86400;
                sisaDetik = detik % 86400;
                jam = sisaDetik / 3600;
                sisaDetik = sisaDetik % 3600;
                menit = sisaDetik / 60;
                sisaDetik = sisaDetik % 60;
                
                System.out.println("hari: "+ hari);
                System.out.println("jam: "+ jam);
                System.out.println("menit: "+ menit);
                System.out.println("detik: "+ sisaDetik);
                
            } else if (detik >= 3600) {
                jam = detik / 3600;
                sisaDetik = detik % 3600;
                menit = sisaDetik / 60;
                sisaDetik = sisaDetik % 60;
                
                System.out.println("jam " +jam); 
                System.out.println("menit" +menit); 
                System.out.println("detik: " +sisaDetik);
            } else if (detik >= 60) {
                menit = detik / 60;
                sisaDetik = detik % 60;
                
                System.out.println("menit: " +menit);
                System.out.println("detik: " +sisaDetik);
            } else {
                System.out.println("detik" +detik);
            }
            
            System.out.print("Input data lagi [Y/T]? ");
        } while (input.next().equalsIgnoreCase("Y"));
        
        input.close();
    }
}