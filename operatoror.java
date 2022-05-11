package operatoror;
import java.util.Scanner;

public class OperatorOR {
	public static void main(String[] args) {
 	Scanner input = new Scanner(System.in);
 	int a, b, c;
	boolean ekspresi1, ekspresi2,ekspresi3,ekspresi4;
 	
	System.out.print("Masukan Nilai A = ");
	a=input.nextInt();
 	System.out.print("Masukan Nilai B = ");
 	b=input.nextInt();
 	System.out.print("Masukan Nilai C = ");
 	c=input.nextInt();

 	ekspresi1 = a + 4 <10;
 	ekspresi2 = b > a + 5;
 	ekspresi3 = c - 3 >= 4;
 	ekspresi4 = ekspresi1 || ekspresi2 || ekspresi3;
 
	System.out.print("\n");
 	System.out.println("Program Ekspresi OR");
 	System.out.println("Hasil dari ekspresi1 = a + 4 <10 adalah "+ekspresi1);
 	System.out.println("Hasil dari ekspresi2 = b > a + 5 adalah "+ekspresi2);
	System.out.println("Hasil dari ekspresi3 = c - 3 >= 4 adalah "+ekspresi3);
 	System.out.println("Hasil dari ekspresi4 = ekspresi1 || ekspresi2 || ekspresi3 adalah "+ekspresi4);
 	}
}
