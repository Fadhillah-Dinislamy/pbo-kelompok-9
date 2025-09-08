import java.util.Scanner;

public class Praktikum3{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("Masukkan Panjang, Lebar, dan Tinggi Prisma (pisahkan dengan spasi): ");
    int panjang = in.nextInt(), lebar = in.nextInt(), tinggi = in.nextInt();
    int volumePrisma = panjang * lebar * tinggi;
    System.out.println("Volume prisma : " + volumePrisma + "cm");
  }
}
