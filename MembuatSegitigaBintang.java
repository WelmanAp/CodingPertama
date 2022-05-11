package membuatsegitigabintang;

public class MembuatSegitigaBintang {
   public static void main(String[] args) {
       int a = 5;
       for (int b = 1; b <= a; a--){
           for (int c = b; c <= a; c++) {
               System.out.print('*');
           }
           System.out.println();
       }
       
    System.out.println("==========================");

       int b = 5;
       for (a = 1; a <= 5; a++){
            for (b = a; b <= 5; b++) {
                System.out.print(" ");
            }
            for ( int c = 1; c <=a; c++) {
                System.out.print("*");
            }
       System.out.println("");
       }
    }
}

  
       



   
