import java.text.DecimalFormat;
import java.util.Scanner;

public class altura_M_F {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");

		int contador = 0;
		double alturaF = 0;
		double alturaG = 0;
		System.out.println("insira seu sexo: ");
		char genero = input.next().charAt(0);
		genero = Character.toUpperCase(genero);
		System.out.println("insira a sua altura: ");
		double altura = input.nextDouble();

		while (altura != 0) {
		
			contador++;
			if (genero == 'F') {
				alturaF = alturaF + altura;
			} else {
				alturaG = alturaG + altura;
			}
			System.out.println("Insira seu sexo: ");
			genero = input.next().charAt(0);
			genero = Character.toUpperCase(genero);
			System.out.println("insira a sua altura: ");
			altura = input.nextDouble();

		}
		System.out.println(
				"A média do grupo é: " + alturaG / contador + " A média das mulheres é: " + alturaF / contador);

	}

}
