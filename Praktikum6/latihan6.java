package Praktikum;

public class Latihan6 {
    public static void main(String[] args) {
        System.out.println("Nama Bank    : " + Bank.NamaBank());

        Rekening rekening1 = new Rekening("Maulana", 123, 5000000);

        rekening1.tampilkanInfo();
        rekening1.setSaldo(1000);
        rekening1.setNamaPemilik("Lord");
        rekening1.setNoRekening(4123);
        System.out.println("Nama rekening adalah" + rekening1.getNamaPemilik());
        System.out.println("Saldo anda sekarang adalah " + rekening1.getSaldo());
        System.out.println("No rekening anda: " + rekening1.getNoRekening());


    }
}
