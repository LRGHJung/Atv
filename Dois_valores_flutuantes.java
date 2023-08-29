import java.text.DecimalFormat;
import java.util.Scanner;

public class Dois_valores_flutuantes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Insira o valor da nota A: ");
		double notaA = input.nextDouble(); 
		System.out.println("Insira o valor da nota B: ");
		double notaB = input.nextDouble();

		double notaa = notaA*3.5;
	    double notab = notaB*6.5;
         double notaAB = notaa+notab;
         double media = notaAB/10; 
         System.out.println("A média é: "+df.format(media));
	}

}
