package hitungnilai;
import java.util.Scanner;


public class Hitung_Nilai {

  
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       String nama; 
       double keaktifan; 
       double tugas;
       double ujian;
       double akhir;
       
       System.out.print("Nama Siswa :");
       nama = input.nextLine();
       System.out.print("Nilai Keaktifan: ");
       keaktifan = input.nextDouble();
       System.out.print("Nilai Tugas : ");
       tugas = input.nextDouble();
       System.out.print("Nilai Ujian: "); 
       ujian = input.nextDouble();
       
       keaktifan = keaktifan*20/100;
       tugas = tugas*30/100;
       ujian = ujian*50/100;
       akhir = keaktifan+tugas+ujian; 
       
       
       System.out.println();
       System.out.println("Siswa yang bernama "+nama);
       System.out.println("Dengan Nilai Presentasi Yang Dihasilkan.");
       System.out.println("Nilai Keaktifan :"+keaktifan);
       System.out.println("Nilai Tugas: "+tugas);
       System.out.println("Nilai Ujian: "+ujian);
       System.out.println("Jadi Siswa Yang Bernama "+nama);
       System.out.println("Memperoleh Nilai Akhir Sebesar"+akhir);            
                           
    }
    
}
