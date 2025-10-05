package com.mycompany.main;

/**
 *
 * @author Fadhillah Dinislamy
 */

public class Mobil {
    String merk;
    String warna;
    int tahunKeluar;
    
    // Constructor
    public Mobil(String merk, String warna, int tahunKeluar){
        this.merk = merk;
        this.warna = warna;
        this.tahunKeluar = tahunKeluar;
    }
    
    // overloading
    public Mobil(){
        merk = "Unknown";
        warna = "Putih";
        tahunKeluar = 2010;
    }
    
    public void panaskanMobil() {
        System.out.println("Mobil sedang dipanaskan...");
    }
}
