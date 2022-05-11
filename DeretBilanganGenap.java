package deretbilangangenap;

import java.util.Scanner;
public class DeretBilanganGenap {
     public static void main(String[] args) {
        int a, b,c;
        for (a = 1; a <= 10; a+=2){
            c = 0;
        for (b=10; b>=a; b-=2){
            System.out.print(b);
            c= c+b;
            if (b-1>a){
                System.out.print("+");
            }
        }
        if (c!=1){
            System.out.println("="+c);
        }
        }
     }
}