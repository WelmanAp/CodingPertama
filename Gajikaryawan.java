package gajikaryawan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Gajikaryawan {
     public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
         DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance ();
         DecimalFormatSymbols formatRp = new DecimalFormatSymbols ();
         
         String nama;
         int jjkerja, gol, jlembur, tun_jabatan, tun_pendidikan, g_lembur, gapok;
         double g_bersih;
         
         System.out.println ("PROGRAM MENGHITUNG GAJI KARYAWAN");
         System.out.println ("--------------------------------------------------------");
         
         System.out.println ("Masukan Nama : ");
         nama=input.nextLine ();
         System.out.println ("Masukan Golongan :") ;
         System.out.println ("Gol 1");
         System.out.println ("Gol 2");
         System.out.println ("Gol 3");
         gol=input.nextInt();
         System.out.println ("Jumlah Jam kerja :");
         jjkerja=input.nextInt ();
        
     
         switch (gol) {
             
         case 1 :
             gapok=300000;
             tun_jabatan=15000;
             tun_pendidikan=7500;
             
         case 2 :
             gapok=300000;
             tun_jabatan=30000;
             tun_pendidikan=15000;
             
         case 3 :
             gapok=300000;
             tun_jabatan=45000;
             tun_pendidikan=22500;
        
             
             
             if (jjkerja>8) {
                 jlembur=jjkerja-8 ;
                 
             }else {
                 jlembur=0; 
                 
             }
             
             formatRp.setCurrencySymbol ("Rp.");
             formatRp.setMonetaryDecimalSeparator (',');
             formatRp.setGroupingSeparator ('.');
             kursIndonesia.setDecimalFormatSymbols(formatRp);
             
             g_lembur=jlembur*2500;
             g_bersih =(gapok+tun_jabatan+tun_pendidikan+g_lembur);
             
             System.out.println("Karyawan Yang Bernama : " +nama);
             System.out.println("Gaji yang diterima");
             System.out.println("Gaji Pokok : " + kursIndonesia.format  (gapok));
             System.out.println ("Tunjangan jabatan : " + kursIndonesia.format (tun_jabatan));
             System.out.println ("Tunjangan Pendidikan : " + kursIndonesia.format (tun_pendidikan));
             System.out.println ("Gaji Lembur : " + kursIndonesia.format (g_lembur));
             System.out.println (" Jumlah Gaji diterima : " + kursIndonesia.format (g_bersih));           
        
                
     	}                                               
                    
    }
    
      
} 

