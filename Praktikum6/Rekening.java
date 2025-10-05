package Praktikum;

public class Rekening {
    private String namaPemilik;
    private int noRekening;
    private double saldo;

    public Rekening(String namaPemilik, int noRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.noRekening = noRekening;
        this.saldo = saldo;
    }
    public String getNamaPemilik() {
        return namaPemilik;
    }
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }
    public int getNoRekening() {
        return noRekening;
    }
    public void setNoRekening(int noRekening) {
        this.noRekening = noRekening;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Saldo tidak valid");
        } else if (saldo == 0) {
            System.out.println("Saldo anda habis");
        this.saldo = saldo;
        }
        else  {
            this.saldo = saldo;
        }
    }

    public void tampilkanInfo(){
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("NoRekening: " + noRekening);
        System.out.println("Saldo: " + saldo);
    }
}
