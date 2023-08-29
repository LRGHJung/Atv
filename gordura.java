import java.text.DecimalFormat;
import java.util.Scanner;

public class gordura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");
	
		
		System.out.println("Insira seu peso: ");
		double peso = input.nextDouble();
		System.out.println("Insira sua altura: ");
		double altura = input.nextDouble();
		double IMC = peso/(altura*altura);
		
		if (IMC <=18.5) {System.out.println("Você está muito magro");}
		if (IMC > 18.5 && IMC <= 24.9) { System.out.println("Você está saudavel");}
		if (IMC >= 25.0 && IMC <= 29.9 ) {System.out.println("Você esta sobrepeso");}
		if (IMC >=30.0 && IMC <= 34.9 ) {System.out.println("Você está com obesidade grau 1"); }
		if (IMC >= 35.0 && IMC <= 39.9) {System.out.println("Você está com obesidade grau 2");}
		if (IMC >= 40) {System.out.println("Você esta com obesidade grau 3");}
 		
	}

}
