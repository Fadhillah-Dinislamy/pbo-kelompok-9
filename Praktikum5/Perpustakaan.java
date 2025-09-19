/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum_5;

/**
 *
 * @author upaaa
 */
public class Perpustakaan {
    String nama;
    String alamat;
    int jumlahBuku;
    
    public Perpustakaan(){
        this.nama = "Perpustakaan Universitas Riau";
        this.alamat = "Jl. Soebrantas, Pekanbaru";
        this.jumlahBuku = 1500;
    }
    
    public Perpustakaan(String nama, String alamat, int jumlahBuku){
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahBuku = jumlahBuku;
    }
    
    public void infoLokasi(){
        System.out.println("Perpustakaan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jumlah buku : " + jumlahBuku);
    }
    
    public void infoLokasi(String tambahan){
        System.out.println("Perpustakaan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Jumlah buku : " + jumlahBuku);
        System.out.println("Keterangan : " + tambahan);
    }
    
}
