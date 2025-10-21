/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prakatikum_6;

/**
 *
 * @author upaa
 */
public class Produk {
    public String nama;
    private int harga;
    protected int stok;
    private final String namaSupplier = "upaa";
    
    //Static variabel
    static int jumlahProduk = 0;
    
    public Produk(String nama, int harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        jumlahProduk++;
    }
    
    public static void infojumlahProduk(){
        System.out.println("Total produk yang di buat adalah: " +jumlahProduk);
    }
    
    private void namaSupplier(){
        System.out.println("nama supplier: "+namaSupplier);
    }
    
    public void namaSupplierFix(){
        namaSupplier();
    }
    
    public void tampilkanInfo(){
        System.out.println("nama : " +nama);
        System.out.println("harga : " +harga);
        System.out.println("stok : " +stok);
    }
    
    public double getHarga(){
        return harga;
    }
    
    public void setHarga(int hargaBaru){
        if(hargaBaru>0){
            this.harga = hargaBaru;
        }
        else if (hargaBaru == 0){
            this.harga = hargaBaru;
            System.out.println("Produk ini gratis.");
        }
        else {
            System.out.println("harga produk tidak boleh negatif.");
        }
    }
    
}
