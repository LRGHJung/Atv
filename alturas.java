import java.text.DecimalFormat;
import java.util.Scanner;

public class alturas {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); 
	    DecimalFormat df = new DecimalFormat("0,00");
	    
	    int contador = 0;
	    double somaaltura = 0;
	    System.out.println("Insira altura");
	    double altura = input.nextDouble();
	    
	    
	   while (altura !=0) {
		   contador++;
		   somaaltura = somaaltura + altura;
		   System.out.println("Insira altura");
		   altura = input.nextDouble();
	   } double media = somaaltura/contador;
	   System.out.println(media);
	    
	    

	}

}
