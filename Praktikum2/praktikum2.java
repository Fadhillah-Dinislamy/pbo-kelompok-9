/**
 *
 * @author Fadhillah
 */
public class Praktikum {
    public static void main(String[] args) {

        // Menampilkan Hello World
        System.out.println("Hello World!");

        // Menampilkan nama
        System.out.println("Fadhillah Dinislamy");

        int umur = 19;
        String nama = "Fadhillah Dinislamy";

        System.out.println("Nama saya : " + nama);
        System.out.println("Umur : " + umur);

        // Deklarasi multiple variable
        int x = 3, y = 3, z = 5;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

        // Array
        double[] ipSemester = {3.9, 3.8, 4.8, 4.1};
        System.out.println("IP semester 2 saya adalah = " + ipSemester[1]);

        // Konversi variable
        int intSemester1 = (int) ipSemester[0];
        System.out.println("Nilai IP semester 1 integer : " + intSemester1);

        long nilaiSangatBesar = 3000000000L;
        int intNilaiSangatBesar = (int) nilaiSangatBesar;
        System.out.println("Nilai sangat besar: " + intNilaiSangatBesar);

        // Konstanta – nilai tetap sepanjang program
        final double PI = 3.14;
        System.out.println("Nilai PI = " + PI);
    }
}
