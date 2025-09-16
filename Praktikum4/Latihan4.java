package Praktikum;
import java.security.PublicKey;
import java.util.Scanner;
public class Praktikum_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.println("Program menghitung bangun datar ");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan sisi persegi(ketik 'k' untuk kembali): ");
                    String inputP = input.nextLine();
                    if(inputP.equalsIgnoreCase("k")) {break;}
                    float sisiP = Float.parseFloat(inputP);
                    float luasP = sisiP * sisiP;
                    System.out.println("Luas persegi: " + luasP);
                    break;
                case 2:
                    System.out.print("Masukkan panjang persegi panjang(ketik 'k' untuk kembali): ");
                    String inputP2 = input.nextLine();
                    if(inputP2.equalsIgnoreCase("k")) {break;}
                    float panjangP = Float.parseFloat(inputP2);
                    System.out.println("Masukkan tinggi persegi panjang: ");
                    float tinggiP2 = input.nextFloat();
                    float luasP2 =  tinggiP2 * tinggiP2;
                    System.out.println("Luas tinggi persegi: " + luasP2);
                case 3:
                    System.out.print("Masukkan jari jari lingkaran(ketik 'k' untuk kembali): ");
                    String inputL = input.nextLine();
                    if(inputL.equalsIgnoreCase("k")) {break;}
                    Float jariL = Float.parseFloat(inputL);
                    float luasL = 3.14f * jariL * jariL;
                    System.out.println("Luas lingkaran: " + luasL);
                    break;
                case 4:
                    System.out.print("Masukkan alas segitiga(ketik 'k' untuk kembali): ");
                    String inputS = input.nextLine();
                    if(inputS.equalsIgnoreCase("k")) {break;}
                    float alasS = Float.parseFloat(inputS);
                    System.out.print("Masukkan tinggi segitiga:         ");
                    float tinggiS = input.nextFloat();
                    float luasS = 0.5f * alasS * tinggiS;
                    System.out.println("Luas segitiga: " + luasS);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;

            }

        }
    }
}
