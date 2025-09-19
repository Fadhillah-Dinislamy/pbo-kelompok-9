/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_praktikum_5;

/**
 *
 * @author M-SI
 */
public class Tugas_praktikum_5 {
    public static void main(String[] args) {
        Perpustakaan perpusSatu = new Perpustakaan();
        Perpustakaan perpusKedua = new Perpustakaan("Perpustakaan Teknik Universitas Riau", "jl. Soebrantas, Pekanbaru", 1000);
        Perpustakaan perpusKetiga = new Perpustakaan("Perpustakaan UIN SUSKA Riau", "jl. Raya Pekanbaru", 1200);
        
        perpusSatu.infoLokasi();
            System.out.println("=".repeat(50));
        perpusKedua.infoLokasi("PERPUSTAKAAN TERDEKAT");
            System.out.println("=".repeat(50));
        perpusKetiga.infoLokasi();
            System.out.println("=".repeat(50));

    }
        
}
