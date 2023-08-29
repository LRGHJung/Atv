import java.text.DecimalFormat;
import java.util.Scanner;

public class Dolar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat centavos = new DecimalFormat("0.00");
		
		System.out.println("insira o valor de quantos dolares voce tem: ");
		double dolares = input.nextInt();
		double reais = dolares*4.9749;
		System.out.println("reais a serem devolvidos: "+reais);
		

	}

}
