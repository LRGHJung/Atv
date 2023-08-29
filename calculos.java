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
		
		System.out.println("A area do triangulo retangulo �: "+df.format(valorC*valorC/2));
		
		System.out.println("A area do circulo �: "+df.format(valorC*valorC*Math.PI));
		
		System.out.println("A area do trapezio �: "+df.format((valorA+valorB)*valorC/2));
		
		System.out.println("A area do quadrado �: "+df.format(valorB*valorB));

        System.out.println("A area do retangulo �: "+df.format(valorA*valorB));
	}

}
