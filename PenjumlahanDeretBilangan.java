package penjumlahanderetbilangan;

import java.util.Scanner;
public class PenjumlahanDeretBilangan {
    public static void main(String[] args) {
        int sum = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Ukuran segitiga :");
        
        int ukuran = in.nextInt();
        
        System.out.print("\n");
        
        for (int i = 1; i <= ukuran; i++) {
            
            int angka = 1;
            
            for (int j = 1; j <= ukuran; j++) {
                if (j <= i) {
                    if (j != i) {
                        angka +=1;
                    }
                }
                System.out.printf("%d", angka );
                if (j !=i) {
                    System.out.printf("+", angka);
                }
                else {
                    System.out.print("   ");
            }
        }
        sum += angka;
        System.out.printf("\t = %d \n",sum);
    	}
    }
}
