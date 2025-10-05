package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Maulana Malik Ibrahim
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        // If Else Statement
        System.out.print("Masukkan nilai : ");
        int nilai = scanner.nextInt();
        if (nilai > 75){
            System.out.println("Anda Lulus Ujian!");
        }else if(nilai > 65){
            System.out.println("Nilai Anda Berada di Ambang Kelulusan!");
        }
        else{
            System.out.println("Anda Harus Mnegulang Ujian!");
            
        }
        
        // Switch Case
        System.out.print("Masukkan Warna (RGB) : ");
        String warna = scanner.next();
        switch(warna){
            case "R":
                System.out.println("Anda Memilih Warna Merah!");
                break;
            case "G":
                System.out.println("Anda Memilih Warna Hijau!");
                break;
            case "B":
                System.out.println("Anda Memilih Warna Biru!");
                break;
            default :
                System.out.println("Warna Tidak Tersedia!");
        }
        
        // Nested If
        System.out.print("Masukkan Angka : ");
        int angka = scanner.nextInt();
        if(angka > 0){
            System.out.println("Bilangan Bernilai Positif!");
            if (angka % 2== 0){
                System.out.print(" dan Bernilai Genap!");
            }else{
                System.out.print(" dan Bernilai Ganjil!");
            }
        }else if (angka == 0){
            System.out.println("Bilangan Bernilai Netral!");
        }
        else{
            System.out.println("Bilangan Bernilai Positif!");
            if (angka % 2 == 0){
                System.out.print(" dan Bernilai Genap!");
            }else{
                System.out.print(" dan Bernilai Ganjil!");
            }
        }
        
        // For Loop
        for (int i = 1; i <= 5; i++){
            System.out.println("For Loop ke-" + i);
        }
        
        // While Loop
        int b = 1;
        while(b <= 5){
            System.out.println("While Loop ke-" + b);
            b++;
        }
        
        // Do While Loop
        int c = 6;
        do{
            System.out.println("While Loop ke-" + b);
            c++;
        }while(c <= 5);
        
        // Break
        for (int d = 1; d <= 10; d++){
            if (d == 5){
                System.out.println("Break di Angka " + d);
                break;
            }
            System.out.println("Angka : " + d);
        }
        
        // Continue
        for(int e = 1; e <= 10; e++){
            if (e % 2 == 0){
                continue;
            }
            System.out.println("Bilangan Ganjil : " + e);
        }
    }
}
