/**
 *
 * @author Fariel
 */
public class Praktikum2 {
       
    public static final String Universitas = "Universitas Riau";
    public static void main(String[] args) {
        // Data Mahasiswa
        String nama = "Muhammad Fariel Gifari", alamat = "Taman Karya";
        int umur = 19;
        double[] ipSemester = {3.5, 3.7, 3.8, 3.6}; // Array IP tiap semester
        char golonganDarah = 'O';
        String nim = "2407127428";

        // Menampilkan data
        System.out.println("Universitas   : " + Universitas);
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Umur          : " + umur + " tahun");
        System.out.println("Alamat        : " + alamat);
        
        System.out.println("\nIP Tiap Semester:");
        for (int i = 0; i < ipSemester.length; i++) {
            System.out.println("Semester " + (i+1) + " = " + ipSemester[i]);
        }

        // Konversi IP ke byte
        double ipAsli = ipSemester[0];     // ambil IP semester 1
        byte ipByte = (byte) ipAsli;       // casting ke byte
        System.out.println("IP Semester 1 dalam bentuk byte = " + ipByte);

    }
}
