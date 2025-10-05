package com.mycompany.main;

/**
 *
 * @author Fadhillah Dinislamy
 */

public class Main {
    public static void main(String[] args) {
        Mobil mobilSaya = new Mobil("Toyota", "Merah", 2025);
        Mobil mobilKedua = new Mobil("Alpard", "Hitam", 2020);
        Mobil mobilKetiga = new Mobil();
        
        Kalkulator calc = new Kalkulator();
        System.out.println("1 + 10 = " + calc.tambah(1, 10));
        System.out.println("2.4 +3.3 = " + calc.tambah(2.4, 3.3));
        
        Orang manusia1 = new Orang("Fadhillah Dinislamy", 19, "Mahasiswa", "Laki-Laki");
        Orang manusia3 = new Orang("Donald Trump", 73, "Tukang Sate", "Laki-Laki");
        Orang manusia2 = new Orang("Asep Surasep", 55, "Perempuan");
        
        manusia1.tampilkanData();
        manusia2.tampilkanData("Dodi");
        manusia3.tampilkanData();
    }
}
