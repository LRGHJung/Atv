import java.text.DecimalFormat;
import java.util.Scanner;

public class calculadora2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");
		
		System.out.println("digite um numero: ");
		double numero = input.nextDouble();
		System.out.println("escolha uma operação 1, 2, 3, 4:");
		int operacao = input.nextInt();
		
		if (operacao == 1) {System.out.println("O resultado é: "+(numero+10));}
		if (operacao == 2) {System.out.println("O resultado é: "+(numero-10));}
		if (operacao == 3) {System.out.println("O resultado é: "+(numero*10));}
		if (operacao == 4) {System.out.println("O resultado é: "+(numero/10));}
		if (operacao <1) {System.err.println("operação invalida");}
		if (operacao >4) {System.err.println("operação invalida");}
	}

}
