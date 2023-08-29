import java.util.Scanner;

public class numero_infinitos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;

		System.out.println("Insira um número: ");

		String letra = input.next();

		if (letra.equalsIgnoreCase("n")) {

			System.out.println("");
		} else {

			while (!letra.equals("n")) {

				int numero = Integer.parseInt(letra);

				if (numero > maiorNumero) {
					maiorNumero = numero;
				}

				if (numero < menorNumero) {
					menorNumero = numero;
				}

				System.out.println("Insira um número");
				letra = input.next();
				if (letra.equalsIgnoreCase("n")) {
				}

			}
			System.out.println("o maior número é " + maiorNumero);
			System.out.println("o menor número é: " + menorNumero);
		}

	}

}
