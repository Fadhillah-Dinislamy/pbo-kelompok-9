package com.mycompany.main;

/**
 *
 * @author Fadhillah Dinislamy
 */

public class Orang {
    String namaLengkap;
    int umur;
    String pekerjaan;
    String jenisKelamin;
    
    public Orang(String nama, int umur, String pekerjaan, String jenisKelamin) {
        this.namaLengkap = nama;
        this.umur = umur;
        this.pekerjaan = pekerjaan;
        this.jenisKelamin = jenisKelamin;
    }
    
    public Orang(String nama, int umur, String jenisKelamin) {
        this.namaLengkap = nama;
        this.umur = umur;
        this.pekerjaan = "tidak bekerja";
        this.jenisKelamin = jenisKelamin;
    }
    
    public void tampilkanData() {
        System.out.println("Nama         : " + namaLengkap);
        System.out.println("Umur         : " + umur);
        System.out.println("Pekerjaan    : " + pekerjaan);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("------------------------------------------------");
        System.out.println();
    }
    
    public void tampilkanData(String namaPanggilan) {
        System.out.println("Nama          : " + namaLengkap);
        System.out.println("Nama Panggilan: " + namaPanggilan);
        System.out.println("Umur          : " + umur);
        System.out.println("Pekerjaan     : " + pekerjaan);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("------------------------------------------------");
        System.out.println();
    }
}
