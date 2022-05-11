package menentukanjuara;
import java.util.Scanner;

public class Menentukan_Juara{
    public static void main(String[] args) {
         
        Scanner input = new Scanner (System.in); 
        String nama;
        char grade ;
        final double n_pertandinganpertama, n_pertandingankedua, n_pertandinganketiga,n_ratarata ;
        
        System.out.println ("=========Program Mengitung Nilai Rata-rata==============");
        System.out.println ("Nama Siswa : ");
        nama=input.nextLine();
        System.out.println ("Pertandingan Pertama : ");
        n_pertandinganpertama=input.nextInt();
        System.out.println ("Pertandingan Kedua  : ");
        n_pertandingankedua=input.nextInt ();
        System.out.println ("Pertandingan Ketiga : " );
        n_pertandinganketiga=input.nextInt ();
     
        n_ratarata= (  0.30 * n_pertandinganpertama + 0.30 * n_pertandingankedua + 0.40 * n_pertandinganketiga);
        if (n_ratarata >= 85 && n_ratarata <=100){
            grade = 'A';
        }
        else if (n_ratarata> 75 && n_ratarata <85){
           grade = 'A' ;
        }
        else if (n_ratarata > 65 && n_ratarata <75) {
          grade = 'B' ;
        }
        else if (n_ratarata > 50 && n_ratarata <65) {
          grade = 'C' ;
        }
        else {
         grade = 'D' ;
        }
        if (grade == 'A'){
            System.out.println ("\n"+nama+" memperoleh hasil Perlombaan dengan nilai "+n_ratarata+" ("+grade+")"+""
                    +"\n dari hasil perlombaan yang diikutinya.Hadiah yang didapatkan adalah 1 Unit KOMPUTER");
          
        }
        if (grade == 'B' ){
               System.out.println ("\n"+nama+" memperoleh hasil Perlombaan dengan nilai "+n_ratarata+" ("+grade+")"+""
                    +"\n  dari hasil perlombaan yang diikutinya.Hadiah yang didapatkan adalah Uang Tunai Rp.500.000");
        } 
        if (grade == 'C'){
               System.out.println ("\n"+nama+" memperoleh hasil Perlombaan dengan nilai "+n_ratarata+" ("+grade+")"+""
                    +"\n dari hasil perlombaan yang diikutinya.Hadiah yang didapatkan adalah Hadiah Hiburan lainnya");
      
       
        
         }               
        
    }
 
}   