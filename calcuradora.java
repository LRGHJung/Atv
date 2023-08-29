import java.text.DecimalFormat;
import java.util.Scanner;

public class calcuradora {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");
		
		System.out.println("Insira o primeiro numero:");
		double numero1 = input.nextDouble();
		System.out.println("Insira o segundo numero");
		double numero2 = input.nextDouble();
		
		System.out.println("Escolha uma opção: 1=adição 2=subtração 3=multiplicação 4=divisão");
		int conta = input.nextInt();
		double sub = numero1-numero2;
		
		if (conta == 1) {System.out.println("A adição resulta: "+numero1 + numero2);}
		else if (conta == 2) {System.out.println("A subtração resulta: "+sub);}
		else if (conta == 3) {System.out.println("A multiplacação resulta: "+numero1*numero2);}
		else if (conta == 4) {System.out.println("A divisão resulta: "+numero1/numero2);}
		else {System.err.println("Conta invalida");}
		
		

	}

}
