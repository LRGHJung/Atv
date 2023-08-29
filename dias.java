import java.util.Scanner;

public class dias {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o dia: ");
		int dia = input.nextInt();

		if (dia > 31 || dia <= 0)

		{
			System.err.println("O dia é inválido");

		}

		else

		{
			System.out.println("insira o mês: ");

		}

		int mes = input.nextInt();

		if (mes > 12 || mes <= 0)

		{
			System.err.println("o mês é inválido");

		}

		else if (mes == 4 && dia >= 31)

		{
			System.err.println("o mês é invalido");

		}

		else if (mes == 6 && dia >= 31)

		{
			System.err.println("o mês é invalido");

		}

		else if (mes == 9 && dia >= 31)

		{
			System.err.println("o mês é invalido");

		}

		else if (mes == 11 && dia >= 31)

		{
			System.err.println("o mês é invalido");

		}

		else {
			System.out.println("insira o ano");

		}

		int ano = input.nextInt();

		if (ano <= 0) {
			System.err.println("o ano é inválido");

		}

		else if (mes == 2 && dia > 29 && ano % 4 == 0) {
			System.out.println("Data válida");

		}

		else if (mes == 2 && dia == 29 && ano % 4 != 0) {
			System.err.println("data invalida");

		}

		else if (ano > 0) {
			System.out.println("o ano é valido");

		}

	}

} 