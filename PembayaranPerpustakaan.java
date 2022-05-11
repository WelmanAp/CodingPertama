package pembayaranperpustakaan;

import java.util.Scanner;
public class PembayaranPerpustakaan {
    static void kalkulasi (char kode, int jumlah, String nama){
       System.out.print("\n");
       int harga=0;
       String kode2=null;
       if (kode=='c'){
           harga=500;
           kode2="cerpen";
       }
       else if(kode=='k'){
           harga=700;
           kode2="komik";
       }
       else if (kode=='n'){
           harga=1000;
           kode2="novel";
       }
       int tarif=harga*jumlah;
       System.out.print("tarif sewa Rp."+harga+
               "\n"+"jenis buku: "+kode2+
               "\n"+"nama penyewa: "+nama+
               "\n"+"jumlah bayar sewa Rp: "+tarif);
           
       }
    public static void main(String[]args){
        Scanner Input = new Scanner(System.in);
        System.out.println("perpustakaan\"kecil-kecilan\"\n");
        System.out.print("nama penyewa buku: ");
        String nama = Input.nextLine();
        System.out.print("kode buku [C/K/N]: ");
        char kode = Input.next().charAt(0);
        System.out.print("jumlah buku: ");
        int jumlah = Input.nextInt();
        kalkulasi(kode,jumlah,nama);
        Input.close();
    }
}
