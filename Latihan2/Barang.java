package Latihan2;

public class Barang{
    // Definisikan variabel
    // nama
    private String bolpoin;
    private String pensil;
    private String penghapus;
    // stok
    private int stokBolpoin;
    private int stokPensil;
    private int stokPenghapus;
    // harga satuan
    private int satuanBolpoin;
    private int satuanPensil;
    private int satuanPenghapus;
    // jumlah harga total barang
    private int hargaTotal;

    // Setter Untuk Variabel
    // setter nama
    public void setBolpoin(String namaBolpoin){
        bolpoin = namaBolpoin;
    }
    public void setPensil(String namaPensil){
        pensil = namaPensil;
    }
    public void setPenghapus(String namaPenghapus){
        penghapus = namaPenghapus;
    }
    
    // setter stok
    public void setstokBolpoin(int jumlahBolpoin){
        stokBolpoin = jumlahBolpoin;
    }
    public void setstokPensil(int jumlahPensil){
        stokPensil = jumlahPensil;
    }
    public void setstokPenghapus(int jumlahPenghapus){
        stokPenghapus = jumlahPenghapus;
    }

    // setter satuan
    public void sethargasatuanBolpoin(int hargasatuanBolpoin){
        satuanBolpoin = hargasatuanBolpoin;
    }
    public void sethargasatuanPensil(int hargasatuanPensil){
        satuanPensil = hargasatuanPensil;
    }
    public void sethargasatuanPenghapus(int hargasatuanPenghapus){
        satuanPenghapus = hargasatuanPenghapus;
    }

    // setter harga total barang
    public void setHargaTotal(int jumlahhargaTotal){
        hargaTotal = jumlahhargaTotal;
    }

    // Getter Untuk Variabel
    // getter nama
    public String getBolpoin(){
        return bolpoin;
    }
    public String getPensil(){
        return pensil;
    }
    public String getPenghapus(){
        return penghapus;
    }
    // getter stok
    public int getstokBolpoin(){
        return stokBolpoin;
    }
    public int getstokPensil(){
        return stokPensil;
    }
    public int getstokPenghapus(){
        return stokPenghapus;
    }
    // getter stok
    public int gettotalBolpoin(){
        return satuanBolpoin;
    }
    public int gettotalPensil(){
        return satuanPensil;
    }
    public int gettotalPenghapus(){
        return satuanPenghapus;
    }
    // getter total
    public int getHargaTotal(){
        return hargaTotal;
    }

    // Method Untuk Rumus
    // hitung harga
    public int hitungHargaBolpoin(){
        return (stokBolpoin*satuanBolpoin);
    }
    public int hitungHargaPensil(){
        return (stokPensil*satuanPensil);
    }
    public int hitungHargaPenghapus(){
        return (stokPenghapus*satuanPenghapus);
    }
    // Method Untuk Harga Total Barang
    public int gethargaTotal(){
        return (hitungHargaBolpoin() + hitungHargaPensil() + hitungHargaPenghapus());
    }

    // method untuk perhitungan input user
    // pulpen
    public int totalbp(){
        return (User.getJBO()*gettotalBolpoin());
    }
    // pensil
    public int totalpen(){
        return (User.getJPEN()*gettotalPensil());
    }
    // penghapus
    public int totalpeng(){
        return (User.getMU()*gettotalPenghapus());
    }
    // rumus belanja total user
    public int gethargaTotals(){
        return (totalbp() + totalpen() + totalpeng());
    }
}