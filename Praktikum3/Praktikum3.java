package com.mycompany.main;

import java.util.Scanner;

/**
 *
 * @author Fadhillah Dinislamy
 */
public class Main {
    public static void main(String[] args) {
        // Operator Aritmatika
        int a = 10, b = 2 ;
        System.out.println("Tambah (+) : " + (a + b));
        System.out.println("Kurang (-) : " + (a - b));
        System.out.println("Kali (*) : " + (a * b));
        System.out.println("Bagi (/) : " + (a / b));
        System.out.println("Modulus (%) : " + (a % b));

        System.out.println();

        // Operator Perbandingan
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        System.out.println();

        // Operator Logika
        boolean x = true, y = false; 
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));

        System.out.println();

        // Operator Assigment
        int i = 10;
        i += 2;
        System.out.println("i += 2 : " + i); 

        System.out.println();

        // Operator Ternary
        int nilai = 80;
        char grade = (nilai >= 80) ? 'A' : (nilai >= 75) ? 'B' : 'C' ;
        System.out.println("Nilai : " + grade );

        // Operator Bitwise
        int m = 12, n= 10;
        System.out.println("m & n = " + (m & n));

        System.out.println();

        // Penggunaan System.out
        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.println();
        System.out.println();
        
        // Output Printf
        String nama = "Upaa";
        int umur = 19; 
        double tinggi = 150.5;
        System.out.printf("Nama saya %s, umur %d, tinggi %.1f cm%n", nama, umur, tinggi); 

        // Input Menggunakan Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nama: ");
        nama = input.nextLine();
        System.out.print("Masukan NIM: ");
        String nim = input.nextLine();
        System.out.println("Hallo nama saya " + nama);
        System.out.println("Nim saya " + nim);

        /*
        try {
        System.out.println("umur");
        int umurUser = input.nextInt();
        System.out.println(umurUser);
        } catch (Exception e) {
        System.out.println("Anda salah input");
        }
        */

        //Class Wrapper
        String str = "19";
        int primitifInt = 100;
        int anotherWrapper = 200;
        int intUmur = Integer.parseInt(str);
        System.out.println("string : " + intUmur);
        Integer wrapperInt = primitifInt; // Autoboxing
        int anotherPrimitif = anotherWrapper; // Unboxing

        // Enumerasi
        enum Hari {
        SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU
        }

        Hari hariIni = Hari.RABU ; 
        if (hariIni == Hari.RABU){
        System.out.println("benar jir, sekarang hari " + Hari.RABU);
        }
    }
}
