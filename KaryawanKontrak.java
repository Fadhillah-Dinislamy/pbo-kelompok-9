/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz2;

/**
 *
 * @author M-SI
 */
public class KaryawanKontrak extends Karyawan implements IDapatGaji {
    private double UpahHarian;
    private int jumlahhariMasuk;
    
     public KaryawanKontrak(String nama, String NIP) {
        super(nama, NIP);
        this.UpahHarian = UpahHarian;
     }

    @Override
    public void tampilkanSlipGaji() {
        System.out.println("nama :" +getNama());
        System.out.println("nama :" +getNIP());
        System.out.println("gaji :" +UpahHarian);
        System.out.println("jumlah hari masuk :" +jumlahhariMasuk);
        System.out.println("Status : karyawan kontrak");
        
    }
        
        
          
}
