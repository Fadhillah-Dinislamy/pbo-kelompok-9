/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prakatikum_6;

/**
 *
 * @author M-SI
 */
public class Prakatikum_6 {

    public static void main(String[] args) {
        //Acces modifier
        Produk p1 = new Produk ("laptop", 7000000, 15);
        Produk p2 = new Produk ("handphone", 15000000, 10);
        
        System.out.println("Nama produk 1 :" +p1.nama);
        // System.out.println(p1.harga);
        
        System.out.println("Hargaa : " +p1.getHarga());
        
        p1.setHarga(700000000);
        System.out.println("Harga baru untuk produk 1 : " +p1.getHarga());
        
        System.out.println(p1.nama);
        System.out.println(p1.stok);
        // System.out.println(p1.harga);
        // p1.namaSupplier();
        p1.namaSupplierFix();
        p1.tampilkanInfo();
        
        //static method
        Produk.infojumlahProduk();
        
    }
}
