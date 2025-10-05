public class Praktikum6 {
    public static void main(String[] args) {
        Produk p1 = new Produk("Laptop", 12000000, 5);
        Produk p2 = new Produk("HP", 3500000, 10);

        System.out.println(p1.nama);
        System.out.println(p1.stok);
        System.out.println(p1.getharga());

        // p1.namaSupplier();
        p2.tampilkanInfo();
        p1.namaSupplierFix();

        p1.tampilkanInfo();
        System.out.println("Harga lama = " + p1.getharga());
        p1.setHarga(500000); // Melakukan perbaruan harga
        System.out.println("Harga baru = " + p1.getharga());

        Produk.infoJumlahProduk();

    }
}
