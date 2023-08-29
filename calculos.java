import java.text.DecimalFormat;
import java.util.Scanner;

public class calculos {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira valor A:");
		double valorA = input.nextDouble();
		System.out.println("Insira valor B:");
		double valorB = input.nextDouble();
		System.out.println("Insira valor C:");
		double valorC = input.nextDouble();
		
		System.out.println("A area do triangulo retangulo é: "+df.format(valorC*valorC/2));
		
		System.out.println("A area do circulo é: "+df.format(valorC*valorC*Math.PI));
		
		System.out.println("A area do trapezio é: "+df.format((valorA+valorB)*valorC/2));
		
		System.out.println("A area do quadrado é: "+df.format(valorB*valorB));

        System.out.println("A area do retangulo é: "+df.format(valorA*valorB));
	}

}
