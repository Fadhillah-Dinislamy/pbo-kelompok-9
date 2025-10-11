package com.mycompany.main;

/**
 * @author Fadhillah Dinislamy.
 */

public class Main{
    public static void main(String[] args){
        BarangElektronik laptop = new BarangElektronik("Laptop", 120000, 5);
        laptop.tampilkanInfo();
        laptop.tampilkangaransi();
        System.out.println("===============================");

        Produk p1 = new Produk("Hp", 500);
        BarangElektronik p2 = new BarangElektronik("Mouse", 500, 8);

        p1.tampilkanInfo();
        System.out.println("Pajak produk            = " + p1.hitungPajak());
        System.out.println("Harga akhir produk      = " + p1.hitungHarga());
        System.out.println("===============================");
        p2.tampilkanInfo();
        p2.tampilkangaransi();
        System.out.println("Pajak Elektronik        = " + p2.hitungPajak());
        System.out.println("Harga akhir Elektronik  = " + p2.hitungHarga());
        // p2.tampilkangaransi();
    }
}