/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kategori_Inputan;

import java.util.Scanner;

/**
 *
 * @author MASTER
 */
public class Input_Keyboard {
    public static void main(String[] args) {
        // Membuat Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("INI MASUKAN :");
        System.out.println("Masukan angka ke 1 = ");
        byte angka1 = input.nextByte();
        System.out.println("Masukan angka ke 2 = ");
        short angka2 = input.nextShort();
        System.out.println("Masukan angka ke 3 = ");
        int angka3 = input.nextInt();
        System.out.println("Masukan angka ke 4 = ");
        long angka4 = input.nextLong();
        
        System.out.println("");
        System.out.println("INI KELUARAN :");
        System.out.println("Isi dari angka 1 = " + angka1);
        System.out.println("Isi dari angka 2 = " + angka2);
        System.out.println("Isi dari angka 3 = " + angka3);
        System.out.println("Isi dari angka 4 = " + angka4);
        
    }
}
