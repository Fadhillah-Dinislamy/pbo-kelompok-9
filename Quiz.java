/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz;

import java.util.Scanner;

/**
 *
 * @author M-SI
 */
public class Quiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //soal 1
        String nama = "Naufa Alya Nafisa";
        int umur = 19;
        System.out.println("Nama saya :" + nama);
        System.out.println("Nama saya :" + umur);
        
        //soal 2
        enum Warna {
            MERAH, HIJAU, BIRU
        }
        Warna warnaIni = Warna.MERAH;
        if(warnaIni == Warna.MERAH);
        System.out.println("Warna " + Warna.MERAH);
        System.out.println("Warna " + Warna.BIRU);
        System.out.println("Warna " + Warna.HIJAU);
        
        //soal 7
        //persegi
        System.out.println("Masukkan angka : ");
        int sisi = input.nextInt();
        
        int persegi = sisi * sisi; 
        System.out.println("hasil : " + persegi);
        
        //segitiga
        System.out.println("Masukkan angka : ");
        int alas = input.nextInt();
        System.out.println("Masukkan angka : ");
        int tinggi = input.nextInt();
        
        int segitiga = 2 * alas * tinggi; 
        System.out.println("hasil : " + segitiga);
        
        //Lingkaran
        System.out.println("Masukkan angka : ");
        double r = input.nextInt();
        double phi = 3.14;
        
        double lingkaran = phi * r * r; 
        System.out.println("hasil : " + lingkaran);
        
        //soal 4
        System.out.println("Masukkan nama: ");
        String nama1 = input.next();
        
        String guru = nama1;
        System.out.println("Halo " + nama1 + " Selamat belajar java!");
       
        
    }
}
