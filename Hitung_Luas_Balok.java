package hitungluasbalok;
import java.util.Scanner; 

public class Hitung_Luas_Balok {

    public static void main(String[] args) {
        
      Scanner input =new Scanner (System.in); 
      int luas,volume; 
      System.out.println( "Program Penghitunga VolumeBalok"); 
    
    
    System.out.print("Panjang : "); 
    int a=input.nextInt();
    System.out.print("Lebar : ");
    int b=input.nextInt();
    System.out.print("Tinggi :"); 
    int c=input.nextInt();
    
    int a=p*l; 
    int b=l*t;
    int c=t*p; 
    luas= 2*(a+b+c); 
    volume=p*l*t;
    System.out.println("Luas Balok =" +luas"); 
    System.out.println("Volume Balok =" +volume); 

    }

}