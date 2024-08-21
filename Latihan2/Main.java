package Latihan2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // buat objek untuk memasukkan input
        Barang beli = new Barang();
        System.out.println("====================================");

        // input untuk bolpoin
        beli.setBolpoin("Bolpoin");
        beli.setstokBolpoin(10);
        beli.sethargasatuanBolpoin(2000);

        // output bolpoin
        System.out.println("nama barang : " + beli.getBolpoin());
        System.out.println("stok : " + beli.getstokBolpoin());
        System.out.println("seharga : " + beli.hitungHargaBolpoin());
        System.out.println("====================================");

        // input untuk pensil
        beli.setPensil("Pensil");
        beli.setstokPensil(10);
        beli.sethargasatuanPensil(1000);

        // output pensil
        System.out.println("nama barang : " + beli.getPensil());
        System.out.println("stok : " + beli.getstokPensil());
        System.out.println("seharga : " + beli.hitungHargaPensil());
        System.out.println("====================================");

        // input untuk penghapus
        beli.setPenghapus("Penghapus");
        beli.setstokPenghapus(10);
        beli.sethargasatuanPenghapus(500);

        // output penghapus
        System.out.println("nama barang : " + beli.getPenghapus());
        System.out.println("stok : " + beli.getstokPenghapus());
        System.out.println("seharga : " + beli.hitungHargaPenghapus());
        System.out.println("====================================");

        // untuk output total harga
        System.out.println("Harga Total Jika Semua Barang Terjual : " + beli.gethargaTotal());
        System.out.println("====================================");

//=============================================================================================================================================================
        System.out.println("BARANG BELANJAAN ANDA");

        // input pembeli
        @SuppressWarnings("resource")
        Scanner inputPembeli = new Scanner(System.in);

        // pulpen
        System.out.println("Nama Barang : " + beli.getBolpoin());
        System.out.print("Masukan Jumlah : ");
        int jbu = inputPembeli.nextInt();

        // pensil
        System.out.println("Nama Barang : " + beli.getPensil());
        System.out.print("Masukan Jumlah : ");
        int jbp = inputPembeli.nextInt();

        // penghapus
        System.out.println("Nama Barang : " + beli.getPenghapus());
        System.out.print("Masukan Jumlah : ");
        int jbpeng = inputPembeli.nextInt();

        // buat objek untuk menyimpan data user
        @SuppressWarnings("unused")
        User user = new User(jbu, jbp, jbpeng);
        
        //Output Belanjaan Anda
        System.out.println("====================================");
        System.out.println("TOTAL BARANG BELANJAAN ANDA : ");
        System.out.println("Total Harga Belanjaan Anda Adalah :");
        System.out.println(beli.getBolpoin() + " = " + beli.totalbp());
        System.out.println(beli.getPensil() + " = " + beli.totalpen());
        System.out.println(beli.getPenghapus() + " = " + beli.totalpeng());
        System.out.println("====================================");
        System.out.println("Total = " + beli.gethargaTotals());
    }
}