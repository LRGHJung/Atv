import java.text.DecimalFormat;
import java.util.Scanner;

public class calculadora_case {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");

		System.out.println("insira o 1 numero: ");
		double numero1 = input.nextDouble();
		System.out.println("insira o 2 numero: ");
		double numero2 = input.nextDouble();

		System.out.println("escolha entre as opera��es 2(subtra��o), 3(multipli��o) e 4(divis�o)");
		int conta = input.nextInt();
		switch (conta) {
		case 2:
			System.out.println(numero1 - numero2);
			break;
		case 3:
			System.out.println(numero1 * numero2);
			break;
		case 4:
			System.out.println(numero1 / numero2);
			break;
		default:
			System.out.println("conta n�o existente");
			break;
		}

	}
}
