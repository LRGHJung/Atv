import java.text.DecimalFormat;
import java.util.Scanner;

public class carros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");
		
		System.out.println("Insira a distancia que o carro Y deve ter do carro X:");
		double km = input.nextDouble();
		double tempomin = km*2;
		System.out.println("O tempo nescessario em minutos é "+tempomin+" minutos");
	
		
		

	}

}
