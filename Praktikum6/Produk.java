public class Produk {
    public String nama;
    private int harga;
    protected int stok;
    private final String namaSupplier = "Yusuf";
    static int jumlahProduk = 0;

    public Produk(String nama, int harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        jumlahProduk++;
    }

    private void namaSupplier(){
        System.out.println("Nama suppliernya adalah : " + namaSupplier);
    }

    public void namaSupplierFix(){
        namaSupplier();
    }

    public void tampilkanInfo(){
        System.out.println("Nama : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
    }

    public int getharga(){
        return harga;
    }

    public void setHarga(int hargaBaru){
        if (hargaBaru > 0) {
            this.harga = hargaBaru;
        } else if (hargaBaru == 0){
            this.harga = hargaBaru;
            System.out.println("Produk ini gratis");
        } else{
            System.out.println("Harga tidak boleh negatif");
        }
    }

    public static void infoJumlahProduk(){
        System.out.println("Total produk yang ada yaitu " + jumlahProduk);
    }
    
    public static void main(String[] args) {
        
    }
}
