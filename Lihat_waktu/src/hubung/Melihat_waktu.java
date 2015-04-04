/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hubung;

/**
 *
 * @author MASTER
 */
public class Melihat_waktu {
    
    // main
    public static void main(String[] args) {
        // mengambil waktu dari malam 1 januari 1970
        long total_mili_detik = System.currentTimeMillis();
        
        // mendapatkan total detik
        long total_detik = total_mili_detik / 1000;
        
        // mendapatkan detik sekarang
        long detik_sekarang = total_detik % 60;
        
        // mendapatakan total menit
        long total_menit = total_detik / 60;
        
        // mendapatkan menit sekarang
        long menit_sekarang = total_menit % 60;
        
        // mendapatkan total jam
        long total_jam = total_menit /60 ;
        
        // mendapatkan jam sekarang
        long jam_sekarang = 5 + (total_jam % 24) ;
        
        System.out.println("Waktu sekarang : ");
        System.out.print(jam_sekarang + " : " + menit_sekarang + " : " + detik_sekarang);
    }
}
